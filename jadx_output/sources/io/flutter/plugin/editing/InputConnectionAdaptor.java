package io.flutter.plugin.editing;

/* loaded from: classes15.dex */
public class InputConnectionAdaptor extends android.view.inputmethod.BaseInputConnection implements io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher {
    private static final java.lang.String TAG = "InputConnectionAdaptor";
    private int batchEditNestDepth;
    private io.flutter.plugin.editing.FlutterTextUtils flutterTextUtils;
    private final io.flutter.plugin.editing.InputConnectionAdaptor.KeyboardDelegate keyboardDelegate;
    private final int mClient;
    private android.view.inputmethod.CursorAnchorInfo.Builder mCursorAnchorInfoBuilder;
    private final io.flutter.plugin.editing.ListenableEditingState mEditable;
    private final android.view.inputmethod.EditorInfo mEditorInfo;
    private android.view.inputmethod.ExtractedTextRequest mExtractRequest;
    private android.view.inputmethod.ExtractedText mExtractedText;
    private final android.view.View mFlutterView;
    private android.view.inputmethod.InputMethodManager mImm;
    private final android.text.Layout mLayout;
    private boolean mMonitorCursorUpdate;
    private final io.flutter.embedding.engine.systemchannels.ScribeChannel scribeChannel;
    private final io.flutter.embedding.engine.systemchannels.TextInputChannel textInputChannel;

    /* loaded from: classes15.dex */
    public interface KeyboardDelegate {
        boolean handleEvent(android.view.KeyEvent keyEvent);
    }

    public InputConnectionAdaptor(android.view.View view, int i17, io.flutter.embedding.engine.systemchannels.TextInputChannel textInputChannel, io.flutter.embedding.engine.systemchannels.ScribeChannel scribeChannel, io.flutter.plugin.editing.InputConnectionAdaptor.KeyboardDelegate keyboardDelegate, io.flutter.plugin.editing.ListenableEditingState listenableEditingState, android.view.inputmethod.EditorInfo editorInfo, io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        super(view, true);
        this.mMonitorCursorUpdate = false;
        this.mExtractedText = new android.view.inputmethod.ExtractedText();
        this.batchEditNestDepth = 0;
        this.mFlutterView = view;
        this.mClient = i17;
        this.textInputChannel = textInputChannel;
        this.scribeChannel = scribeChannel;
        this.mEditable = listenableEditingState;
        listenableEditingState.addEditingStateListener(this);
        this.mEditorInfo = editorInfo;
        this.keyboardDelegate = keyboardDelegate;
        this.flutterTextUtils = new io.flutter.plugin.editing.FlutterTextUtils(flutterJNI);
        this.mLayout = new android.text.DynamicLayout(listenableEditingState, new android.text.TextPaint(), Integer.MAX_VALUE, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.mImm = (android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method");
    }

    private static int clampIndexToEditable(int i17, android.text.Editable editable) {
        int max = java.lang.Math.max(0, java.lang.Math.min(editable.length(), i17));
        if (max != i17) {
            io.flutter.Log.d("flutter", "Text selection index was clamped (" + i17 + "->" + max + ") to remain in bounds. This may not be your fault, as some keyboards may select outside of bounds.");
        }
        return max;
    }

    private boolean doPerformContextMenuAction(int i17) {
        if (i17 == 16908319) {
            setSelection(0, this.mEditable.length());
            return true;
        }
        if (i17 == 16908320) {
            int selectionStart = android.text.Selection.getSelectionStart(this.mEditable);
            int selectionEnd = android.text.Selection.getSelectionEnd(this.mEditable);
            if (selectionStart != selectionEnd) {
                int min = java.lang.Math.min(selectionStart, selectionEnd);
                int max = java.lang.Math.max(selectionStart, selectionEnd);
                ((android.content.ClipboardManager) this.mFlutterView.getContext().getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText("text label?", this.mEditable.subSequence(min, max)));
                this.mEditable.delete(min, max);
                setSelection(min, min);
            }
            return true;
        }
        if (i17 == 16908321) {
            int selectionStart2 = android.text.Selection.getSelectionStart(this.mEditable);
            int selectionEnd2 = android.text.Selection.getSelectionEnd(this.mEditable);
            if (selectionStart2 != selectionEnd2) {
                ((android.content.ClipboardManager) this.mFlutterView.getContext().getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText("text label?", this.mEditable.subSequence(java.lang.Math.min(selectionStart2, selectionEnd2), java.lang.Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        }
        if (i17 != 16908322) {
            return false;
        }
        android.content.ClipData primaryClip = ((android.content.ClipboardManager) this.mFlutterView.getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip != null) {
            java.lang.CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.mFlutterView.getContext());
            int max2 = java.lang.Math.max(0, android.text.Selection.getSelectionStart(this.mEditable));
            int max3 = java.lang.Math.max(0, android.text.Selection.getSelectionEnd(this.mEditable));
            int min2 = java.lang.Math.min(max2, max3);
            int max4 = java.lang.Math.max(max2, max3);
            if (min2 != max4) {
                this.mEditable.delete(min2, max4);
            }
            this.mEditable.insert(min2, coerceToText);
            int length = min2 + coerceToText.length();
            setSelection(length, length);
        }
        return true;
    }

    private android.view.inputmethod.CursorAnchorInfo getCursorAnchorInfo() {
        android.view.inputmethod.CursorAnchorInfo.Builder builder = this.mCursorAnchorInfoBuilder;
        if (builder == null) {
            this.mCursorAnchorInfoBuilder = new android.view.inputmethod.CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.mCursorAnchorInfoBuilder.setSelectionRange(this.mEditable.getSelectionStart(), this.mEditable.getSelectionEnd());
        int composingStart = this.mEditable.getComposingStart();
        int composingEnd = this.mEditable.getComposingEnd();
        if (composingStart < 0 || composingEnd <= composingStart) {
            this.mCursorAnchorInfoBuilder.setComposingText(-1, "");
        } else {
            this.mCursorAnchorInfoBuilder.setComposingText(composingStart, this.mEditable.toString().subSequence(composingStart, composingEnd));
        }
        return this.mCursorAnchorInfoBuilder.build();
    }

    private android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest) {
        java.lang.CharSequence listenableEditingState;
        android.view.inputmethod.ExtractedText extractedText = this.mExtractedText;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.mEditable.getSelectionStart();
        this.mExtractedText.selectionEnd = this.mEditable.getSelectionEnd();
        android.view.inputmethod.ExtractedText extractedText2 = this.mExtractedText;
        if (extractedTextRequest != null && (extractedTextRequest.flags & 1) != 0) {
            listenableEditingState = this.mEditable;
        } else {
            listenableEditingState = this.mEditable.toString();
        }
        extractedText2.text = listenableEditingState;
        return this.mExtractedText;
    }

    private boolean handleHorizontalMovement(boolean z17, boolean z18) {
        int selectionStart = android.text.Selection.getSelectionStart(this.mEditable);
        int selectionEnd = android.text.Selection.getSelectionEnd(this.mEditable);
        boolean z19 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int max = z17 ? java.lang.Math.max(this.flutterTextUtils.getOffsetBefore(this.mEditable, selectionEnd), 0) : java.lang.Math.min(this.flutterTextUtils.getOffsetAfter(this.mEditable, selectionEnd), this.mEditable.length());
        if (selectionStart == selectionEnd && !z18) {
            z19 = true;
        }
        if (z19) {
            setSelection(max, max);
        } else {
            setSelection(selectionStart, max);
        }
        return true;
    }

    private boolean handleVerticalMovement(boolean z17, boolean z18) {
        int selectionStart = android.text.Selection.getSelectionStart(this.mEditable);
        int selectionEnd = android.text.Selection.getSelectionEnd(this.mEditable);
        boolean z19 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z18) {
            z19 = true;
        }
        beginBatchEdit();
        if (z19) {
            if (z17) {
                android.text.Selection.moveUp(this.mEditable, this.mLayout);
            } else {
                android.text.Selection.moveDown(this.mEditable, this.mLayout);
            }
            int selectionStart2 = android.text.Selection.getSelectionStart(this.mEditable);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z17) {
                android.text.Selection.extendUp(this.mEditable, this.mLayout);
            } else {
                android.text.Selection.extendDown(this.mEditable, this.mLayout);
            }
            setSelection(android.text.Selection.getSelectionStart(this.mEditable), android.text.Selection.getSelectionEnd(this.mEditable));
        }
        endBatchEdit();
        return true;
    }

    private byte[] readStreamFully(java.io.InputStream inputStream, int i17) {
        int i18;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[i17];
        while (true) {
            try {
                i18 = inputStream.read(bArr);
            } catch (java.io.IOException unused) {
                i18 = -1;
            }
            if (i18 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i18);
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.mEditable.beginBatchEdit();
        this.batchEditNestDepth++;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i17) {
        return super.clearMetaKeyStates(i17);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.mEditable.removeEditingStateListener(this);
        while (this.batchEditNestDepth > 0) {
            endBatchEdit();
            this.batchEditNestDepth--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i17, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT >= 25 && (i17 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    android.net.Uri contentUri = inputContentInfo.getContentUri();
                    java.lang.String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    android.content.Context context = this.mFlutterView.getContext();
                    if (contentUri != null) {
                        try {
                            java.io.InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                byte[] readStreamFully = readStreamFully(openInputStream, 65536);
                                java.util.HashMap hashMap = new java.util.HashMap();
                                hashMap.put("mimeType", mimeType);
                                hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, readStreamFully);
                                hashMap.put("uri", contentUri.toString());
                                this.textInputChannel.commitContent(this.mClient, hashMap);
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (java.io.FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (java.lang.Exception unused2) {
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(java.lang.CharSequence charSequence, int i17) {
        return super.commitText(charSequence, i17);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i17, int i18) {
        if (this.mEditable.getSelectionStart() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i17, i18);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i17, int i18) {
        return super.deleteSurroundingTextInCodePoints(i17, i18);
    }

    @Override // io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher
    public void didChangeEditingState(boolean z17, boolean z18, boolean z19) {
        this.mImm.updateSelection(this.mFlutterView, this.mEditable.getSelectionStart(), this.mEditable.getSelectionEnd(), this.mEditable.getComposingStart(), this.mEditable.getComposingEnd());
        android.view.inputmethod.ExtractedTextRequest extractedTextRequest = this.mExtractRequest;
        if (extractedTextRequest != null) {
            this.mImm.updateExtractedText(this.mFlutterView, extractedTextRequest.token, getExtractedText(extractedTextRequest));
        }
        if (this.mMonitorCursorUpdate) {
            this.mImm.updateCursorAnchorInfo(this.mFlutterView, getCursorAnchorInfo());
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.batchEditNestDepth--;
        this.mEditable.endBatchEdit();
        return endBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public android.text.Editable getEditable() {
        return this.mEditable;
    }

    public boolean handleKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return handleHorizontalMovement(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return handleHorizontalMovement(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return handleVerticalMovement(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return handleVerticalMovement(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                android.view.inputmethod.EditorInfo editorInfo = this.mEditorInfo;
                if ((editorInfo.inputType & 131072) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = android.text.Selection.getSelectionStart(this.mEditable);
            int selectionEnd = android.text.Selection.getSelectionEnd(this.mEditable);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                int min = java.lang.Math.min(selectionStart, selectionEnd);
                int max = java.lang.Math.max(selectionStart, selectionEnd);
                beginBatchEdit();
                if (min != max) {
                    this.mEditable.delete(min, max);
                }
                this.mEditable.insert(min, (java.lang.CharSequence) java.lang.String.valueOf((char) unicodeChar));
                int i17 = min + 1;
                setSelection(i17, i17);
                endBatchEdit();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i17) {
        beginBatchEdit();
        boolean doPerformContextMenuAction = doPerformContextMenuAction(i17);
        endBatchEdit();
        return doPerformContextMenuAction;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i17) {
        if (i17 == 0) {
            this.textInputChannel.unspecifiedAction(this.mClient);
        } else if (i17 == 1) {
            this.textInputChannel.newline(this.mClient);
        } else if (i17 == 2) {
            this.textInputChannel.go(this.mClient);
        } else if (i17 == 3) {
            this.textInputChannel.search(this.mClient);
        } else if (i17 == 4) {
            this.textInputChannel.send(this.mClient);
        } else if (i17 == 5) {
            this.textInputChannel.next(this.mClient);
        } else if (i17 != 7) {
            this.textInputChannel.done(this.mClient);
        } else {
            this.textInputChannel.previous(this.mClient);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        this.textInputChannel.performPrivateCommand(this.mClient, str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i17) {
        if ((i17 & 1) != 0) {
            this.mImm.updateCursorAnchorInfo(this.mFlutterView, getCursorAnchorInfo());
        }
        boolean z17 = (i17 & 2) != 0;
        if (z17 != this.mMonitorCursorUpdate) {
            io.flutter.Log.d(TAG, "The input method toggled cursor monitoring ".concat(z17 ? "on" : "off"));
        }
        this.mMonitorCursorUpdate = z17;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        return this.keyboardDelegate.handleEvent(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i17, int i18) {
        return super.setComposingRegion(i17, i18);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(java.lang.CharSequence charSequence, int i17) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i17) : super.setComposingText(charSequence, i17);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i17, int i18) {
        beginBatchEdit();
        boolean selection = super.setSelection(i17, i18);
        endBatchEdit();
        return selection;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i17) {
        boolean z17 = (i17 & 1) != 0;
        if (z17 == (this.mExtractRequest == null)) {
            io.flutter.Log.d(TAG, "The input method toggled text monitoring ".concat(z17 ? "on" : "off"));
        }
        this.mExtractRequest = z17 ? extractedTextRequest : null;
        return getExtractedText(extractedTextRequest);
    }

    public InputConnectionAdaptor(android.view.View view, int i17, io.flutter.embedding.engine.systemchannels.TextInputChannel textInputChannel, io.flutter.embedding.engine.systemchannels.ScribeChannel scribeChannel, io.flutter.plugin.editing.InputConnectionAdaptor.KeyboardDelegate keyboardDelegate, io.flutter.plugin.editing.ListenableEditingState listenableEditingState, android.view.inputmethod.EditorInfo editorInfo) {
        this(view, i17, textInputChannel, scribeChannel, keyboardDelegate, listenableEditingState, editorInfo, new io.flutter.embedding.engine.FlutterJNI());
    }
}
