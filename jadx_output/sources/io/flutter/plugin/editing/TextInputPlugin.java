package io.flutter.plugin.editing;

/* loaded from: classes15.dex */
public class TextInputPlugin implements io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher {
    private static final java.lang.String TAG = "TextInputPlugin";
    private final android.view.autofill.AutofillManager afm;
    private android.util.SparseArray<io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration> autofillConfiguration;
    private io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration;
    private io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback imeSyncCallback;
    private io.flutter.plugin.editing.TextInputPlugin.InputTarget inputTarget = new io.flutter.plugin.editing.TextInputPlugin.InputTarget(io.flutter.plugin.editing.TextInputPlugin.InputTarget.Type.NO_TARGET, 0);
    private boolean isInputConnectionLocked;
    private android.graphics.Rect lastClientRect;
    private android.view.inputmethod.InputConnection lastInputConnection;
    private io.flutter.plugin.editing.ListenableEditingState mEditable;
    private final android.view.inputmethod.InputMethodManager mImm;
    private io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState mLastKnownFrameworkTextEditingState;
    private boolean mRestartInputPending;
    private final android.view.View mView;
    private io.flutter.embedding.engine.systemchannels.TextInputChannel.WxInputConfiguration mWxInputConfiguration;
    private io.flutter.plugin.editing.WxKeyboardAction mWxKeyboardAction;
    private io.flutter.plugin.platform.PlatformViewsController platformViewsController;
    private io.flutter.plugin.platform.PlatformViewsController2 platformViewsController2;
    private final io.flutter.embedding.engine.systemchannels.ScribeChannel scribeChannel;
    private final io.flutter.embedding.engine.systemchannels.TextInputChannel textInputChannel;

    /* loaded from: classes15.dex */
    public static class InputTarget {

        /* renamed from: id, reason: collision with root package name */
        int f293235id;
        io.flutter.plugin.editing.TextInputPlugin.InputTarget.Type type;

        /* loaded from: classes15.dex */
        public enum Type {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public InputTarget(io.flutter.plugin.editing.TextInputPlugin.InputTarget.Type type, int i17) {
            this.type = type;
            this.f293235id = i17;
        }
    }

    /* loaded from: classes15.dex */
    public interface MinMax {
        void inspect(double d17, double d18);
    }

    public TextInputPlugin(android.view.View view, io.flutter.embedding.engine.systemchannels.TextInputChannel textInputChannel, io.flutter.embedding.engine.systemchannels.ScribeChannel scribeChannel, io.flutter.plugin.platform.PlatformViewsController platformViewsController, io.flutter.plugin.platform.PlatformViewsController2 platformViewsController2) {
        this.mView = view;
        this.mEditable = new io.flutter.plugin.editing.ListenableEditingState(null, view);
        this.mImm = (android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method");
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 26) {
            this.afm = (android.view.autofill.AutofillManager) view.getContext().getSystemService(android.view.autofill.AutofillManager.class);
        } else {
            this.afm = null;
        }
        if (i17 >= 30) {
            io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback(view);
            this.imeSyncCallback = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.textInputChannel = textInputChannel;
        textInputChannel.setTextInputMethodHandler(new io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler() { // from class: io.flutter.plugin.editing.TextInputPlugin.1
            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void clearClient() {
                io.flutter.plugin.editing.TextInputPlugin.this.clearTextInputClient();
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void finishAutofillContext(boolean z17) {
                if (android.os.Build.VERSION.SDK_INT < 26 || io.flutter.plugin.editing.TextInputPlugin.this.afm == null) {
                    return;
                }
                if (z17) {
                    io.flutter.plugin.editing.TextInputPlugin.this.afm.commit();
                } else {
                    io.flutter.plugin.editing.TextInputPlugin.this.afm.cancel();
                }
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void hide() {
                if (io.flutter.plugin.editing.TextInputPlugin.this.inputTarget.type == io.flutter.plugin.editing.TextInputPlugin.InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                    io.flutter.plugin.editing.TextInputPlugin.this.notifyViewExited();
                } else if (io.flutter.plugin.editing.TextInputPlugin.this.mWxKeyboardAction == null || !io.flutter.plugin.editing.TextInputPlugin.this.mWxKeyboardAction.hideKeyboard()) {
                    io.flutter.plugin.editing.TextInputPlugin textInputPlugin = io.flutter.plugin.editing.TextInputPlugin.this;
                    textInputPlugin.hideTextInput(textInputPlugin.mView);
                }
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void requestAutofill() {
                io.flutter.plugin.editing.TextInputPlugin.this.notifyViewEntered();
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void sendAppPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
                io.flutter.plugin.editing.TextInputPlugin.this.sendTextInputAppPrivateCommand(str, bundle);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setClient(int i18, io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration) {
                io.flutter.plugin.editing.TextInputPlugin.this.setTextInputClient(i18, configuration);
                io.flutter.plugin.editing.TextInputPlugin.this.mWxInputConfiguration = configuration.wxInputConfiguration;
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setEditableSizeAndTransform(double d17, double d18, double[] dArr) {
                io.flutter.plugin.editing.TextInputPlugin.this.saveEditableSizeAndTransform(d17, d18, dArr);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setEditingState(io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState textEditState) {
                io.flutter.plugin.editing.TextInputPlugin textInputPlugin = io.flutter.plugin.editing.TextInputPlugin.this;
                textInputPlugin.setTextInputEditingState(textInputPlugin.mView, textEditState);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setPlatformViewClient(int i18, boolean z17) {
                io.flutter.plugin.editing.TextInputPlugin.this.setPlatformViewTextInputClient(i18, z17);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setTextSelectionState(java.util.Map<java.lang.String, java.lang.Integer> map) {
                io.flutter.plugin.editing.TextInputPlugin.this.mEditable.updateTextInputSelectionState(map);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void show() {
                if (io.flutter.plugin.editing.TextInputPlugin.this.mWxKeyboardAction == null || !io.flutter.plugin.editing.TextInputPlugin.this.mWxKeyboardAction.showKeyboard(io.flutter.plugin.editing.TextInputPlugin.this.mView, io.flutter.plugin.editing.TextInputPlugin.this.mWxInputConfiguration)) {
                    io.flutter.plugin.editing.TextInputPlugin textInputPlugin = io.flutter.plugin.editing.TextInputPlugin.this;
                    textInputPlugin.showTextInput(textInputPlugin.mView);
                }
            }
        });
        textInputChannel.requestExistingInputState();
        this.scribeChannel = scribeChannel;
        this.platformViewsController = platformViewsController;
        platformViewsController.attachTextInputPlugin(this);
        this.platformViewsController2 = platformViewsController2;
        platformViewsController2.attachTextInputPlugin(this);
    }

    private static boolean composingChanged(io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState textEditState, io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState textEditState2) {
        int i17 = textEditState.composingEnd - textEditState.composingStart;
        if (i17 != textEditState2.composingEnd - textEditState2.composingStart) {
            return true;
        }
        for (int i18 = 0; i18 < i17; i18++) {
            if (textEditState.text.charAt(textEditState.composingStart + i18) != textEditState2.text.charAt(textEditState2.composingStart + i18)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideTextInput(android.view.View view) {
        notifyViewExited();
        this.mImm.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    private static int inputTypeFromTextInputType(io.flutter.embedding.engine.systemchannels.TextInputChannel.InputType inputType, boolean z17, boolean z18, boolean z19, boolean z27, io.flutter.embedding.engine.systemchannels.TextInputChannel.TextCapitalization textCapitalization) {
        io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType textInputType = inputType.type;
        if (textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.DATETIME) {
            return 4;
        }
        if (textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.NUMBER) {
            int i17 = inputType.isSigned ? 4098 : 2;
            return inputType.isDecimal ? i17 | 8192 : i17;
        }
        if (textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.PHONE) {
            return 3;
        }
        if (textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.NONE) {
            return 0;
        }
        int i18 = textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.MULTILINE ? 131073 : (textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.EMAIL_ADDRESS || textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.TWITTER) ? 33 : (textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.URL || textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.WEB_SEARCH) ? 17 : textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.VISIBLE_PASSWORD ? 145 : textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.NAME ? 97 : textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.POSTAL_ADDRESS ? 113 : 1;
        if (z17) {
            i18 = i18 | 524288 | 128;
        } else {
            if (z18) {
                i18 |= 32768;
            }
            if (!z19) {
                i18 = i18 | 524288 | 144;
            }
        }
        return textCapitalization == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextCapitalization.CHARACTERS ? i18 | 4096 : textCapitalization == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextCapitalization.WORDS ? i18 | 8192 : textCapitalization == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextCapitalization.SENTENCES ? i18 | 16384 : i18;
    }

    private boolean isRestartAlwaysRequired() {
        if (this.mImm.getCurrentInputMethodSubtype() == null || !android.os.Build.MANUFACTURER.equals("samsung")) {
            return false;
        }
        android.content.ContentResolver contentResolver = this.mView.getContext().getContentResolver();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("default_input_method");
        arrayList.add(contentResolver);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        java.lang.String str = (java.lang.String) yj0.a.k(obj, arrayList.toArray(), "io/flutter/plugin/editing/TextInputPlugin", "isRestartAlwaysRequired", "()Z", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        if (str == null) {
            return false;
        }
        return str.contains("Samsung");
    }

    private boolean needsAutofill() {
        return this.autofillConfiguration != null;
    }

    private void notifyValueChanged(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT < 26 || this.afm == null || !needsAutofill()) {
            return;
        }
        this.afm.notifyValueChanged(this.mView, this.configuration.autofill.uniqueIdentifier.hashCode(), android.view.autofill.AutofillValue.forText(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyViewEntered() {
        if (android.os.Build.VERSION.SDK_INT < 26 || this.afm == null || !needsAutofill()) {
            return;
        }
        java.lang.String str = this.configuration.autofill.uniqueIdentifier;
        int[] iArr = new int[2];
        this.mView.getLocationOnScreen(iArr);
        android.graphics.Rect rect = new android.graphics.Rect(this.lastClientRect);
        rect.offset(iArr[0], iArr[1]);
        this.afm.notifyViewEntered(this.mView, str.hashCode(), rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyViewExited() {
        io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration;
        if (android.os.Build.VERSION.SDK_INT < 26 || this.afm == null || (configuration = this.configuration) == null || configuration.autofill == null || !needsAutofill()) {
            return;
        }
        this.afm.notifyViewExited(this.mView, this.configuration.autofill.uniqueIdentifier.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveEditableSizeAndTransform(double d17, double d18, final double[] dArr) {
        final double[] dArr2 = new double[4];
        final boolean z17 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d19 = dArr[12];
        double d27 = dArr[15];
        double d28 = d19 / d27;
        dArr2[1] = d28;
        dArr2[0] = d28;
        double d29 = dArr[13] / d27;
        dArr2[3] = d29;
        dArr2[2] = d29;
        io.flutter.plugin.editing.TextInputPlugin.MinMax minMax = new io.flutter.plugin.editing.TextInputPlugin.MinMax() { // from class: io.flutter.plugin.editing.TextInputPlugin.2
            @Override // io.flutter.plugin.editing.TextInputPlugin.MinMax
            public void inspect(double d37, double d38) {
                double d39 = 1.0d;
                if (!z17) {
                    double[] dArr3 = dArr;
                    d39 = 1.0d / (((dArr3[3] * d37) + (dArr3[7] * d38)) + dArr3[15]);
                }
                double[] dArr4 = dArr;
                double d47 = ((dArr4[0] * d37) + (dArr4[4] * d38) + dArr4[12]) * d39;
                double d48 = ((dArr4[1] * d37) + (dArr4[5] * d38) + dArr4[13]) * d39;
                double[] dArr5 = dArr2;
                if (d47 < dArr5[0]) {
                    dArr5[0] = d47;
                } else if (d47 > dArr5[1]) {
                    dArr5[1] = d47;
                }
                if (d48 < dArr5[2]) {
                    dArr5[2] = d48;
                } else if (d48 > dArr5[3]) {
                    dArr5[3] = d48;
                }
            }
        };
        minMax.inspect(d17, 0.0d);
        minMax.inspect(d17, d18);
        minMax.inspect(0.0d, d18);
        java.lang.Float valueOf = java.lang.Float.valueOf(this.mView.getContext().getResources().getDisplayMetrics().density);
        this.lastClientRect = new android.graphics.Rect((int) (dArr2[0] * valueOf.floatValue()), (int) (dArr2[2] * valueOf.floatValue()), (int) java.lang.Math.ceil(dArr2[1] * valueOf.floatValue()), (int) java.lang.Math.ceil(dArr2[3] * valueOf.floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformViewTextInputClient(int i17, boolean z17) {
        if (!z17) {
            this.inputTarget = new io.flutter.plugin.editing.TextInputPlugin.InputTarget(io.flutter.plugin.editing.TextInputPlugin.InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW, i17);
            this.lastInputConnection = null;
        } else {
            this.mView.requestFocus();
            this.inputTarget = new io.flutter.plugin.editing.TextInputPlugin.InputTarget(io.flutter.plugin.editing.TextInputPlugin.InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW, i17);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
        }
    }

    private void updateAutofillConfigurationIfNeeded(io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (configuration == null || configuration.autofill == null) {
            this.autofillConfiguration = null;
            return;
        }
        io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration[] configurationArr = configuration.fields;
        android.util.SparseArray<io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration> sparseArray = new android.util.SparseArray<>();
        this.autofillConfiguration = sparseArray;
        if (configurationArr == null) {
            sparseArray.put(configuration.autofill.uniqueIdentifier.hashCode(), configuration);
            return;
        }
        for (io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration2 : configurationArr) {
            io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill autofill = configuration2.autofill;
            if (autofill != null) {
                this.autofillConfiguration.put(autofill.uniqueIdentifier.hashCode(), configuration2);
                this.afm.notifyValueChanged(this.mView, autofill.uniqueIdentifier.hashCode(), android.view.autofill.AutofillValue.forText(autofill.editState.text));
            }
        }
    }

    public void autofill(android.util.SparseArray<android.view.autofill.AutofillValue> sparseArray) {
        io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration;
        io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill autofill;
        io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill autofill2;
        if (android.os.Build.VERSION.SDK_INT < 26 || (configuration = this.configuration) == null || this.autofillConfiguration == null || (autofill = configuration.autofill) == null) {
            return;
        }
        java.util.HashMap<java.lang.String, io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState> hashMap = new java.util.HashMap<>();
        for (int i17 = 0; i17 < sparseArray.size(); i17++) {
            io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration2 = this.autofillConfiguration.get(sparseArray.keyAt(i17));
            if (configuration2 != null && (autofill2 = configuration2.autofill) != null) {
                java.lang.String charSequence = sparseArray.valueAt(i17).getTextValue().toString();
                io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState textEditState = new io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (autofill2.uniqueIdentifier.equals(autofill.uniqueIdentifier)) {
                    this.mEditable.setEditingState(textEditState);
                } else {
                    hashMap.put(autofill2.uniqueIdentifier, textEditState);
                }
            }
        }
        this.textInputChannel.updateEditingStateWithTag(this.inputTarget.f293235id, hashMap);
    }

    public void clearPlatformViewClient(int i17) {
        io.flutter.plugin.editing.TextInputPlugin.InputTarget inputTarget = this.inputTarget;
        io.flutter.plugin.editing.TextInputPlugin.InputTarget.Type type = inputTarget.type;
        if ((type == io.flutter.plugin.editing.TextInputPlugin.InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW || type == io.flutter.plugin.editing.TextInputPlugin.InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) && inputTarget.f293235id == i17) {
            this.inputTarget = new io.flutter.plugin.editing.TextInputPlugin.InputTarget(io.flutter.plugin.editing.TextInputPlugin.InputTarget.Type.NO_TARGET, 0);
            notifyViewExited();
            this.mImm.hideSoftInputFromWindow(this.mView.getApplicationWindowToken(), 0);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
        }
    }

    public void clearTextInputClient() {
        if (this.inputTarget.type == io.flutter.plugin.editing.TextInputPlugin.InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.mEditable.removeEditingStateListener(this);
        notifyViewExited();
        this.configuration = null;
        updateAutofillConfigurationIfNeeded(null);
        this.inputTarget = new io.flutter.plugin.editing.TextInputPlugin.InputTarget(io.flutter.plugin.editing.TextInputPlugin.InputTarget.Type.NO_TARGET, 0);
        this.lastClientRect = null;
        this.mImm.restartInput(this.mView);
    }

    public android.view.inputmethod.InputConnection createInputConnection(android.view.View view, io.flutter.embedding.android.KeyboardManager keyboardManager, android.view.inputmethod.EditorInfo editorInfo) {
        io.flutter.plugin.editing.TextInputPlugin.InputTarget inputTarget = this.inputTarget;
        io.flutter.plugin.editing.TextInputPlugin.InputTarget.Type type = inputTarget.type;
        if (type == io.flutter.plugin.editing.TextInputPlugin.InputTarget.Type.NO_TARGET) {
            this.lastInputConnection = null;
            return null;
        }
        if (type == io.flutter.plugin.editing.TextInputPlugin.InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (type == io.flutter.plugin.editing.TextInputPlugin.InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.isInputConnectionLocked) {
                return this.lastInputConnection;
            }
            android.view.inputmethod.InputConnection onCreateInputConnection = this.platformViewsController.getPlatformViewById(inputTarget.f293235id).onCreateInputConnection(editorInfo);
            this.lastInputConnection = onCreateInputConnection;
            return onCreateInputConnection;
        }
        io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration = this.configuration;
        int inputTypeFromTextInputType = inputTypeFromTextInputType(configuration.inputType, configuration.obscureText, configuration.autocorrect, configuration.enableSuggestions, configuration.enableIMEPersonalizedLearning, configuration.textCapitalization);
        editorInfo.inputType = inputTypeFromTextInputType;
        editorInfo.imeOptions = com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62;
        if (android.os.Build.VERSION.SDK_INT >= 26 && !this.configuration.enableIMEPersonalizedLearning) {
            editorInfo.imeOptions = 33554432 | com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62;
        }
        java.lang.Integer num = this.configuration.inputAction;
        int intValue = num == null ? (inputTypeFromTextInputType & 131072) != 0 ? 1 : 6 : num.intValue();
        io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration2 = this.configuration;
        java.lang.String str = configuration2.actionLabel;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (configuration2.hintLocales != null) {
            editorInfo.hintLocales = new android.os.LocaleList(this.configuration.hintLocales);
        }
        java.lang.String[] strArr = this.configuration.contentCommitMimeTypes;
        if (strArr != null) {
            q3.a.a(editorInfo, strArr);
        }
        io.flutter.plugin.editing.InputConnectionAdaptor inputConnectionAdaptor = new io.flutter.plugin.editing.InputConnectionAdaptor(view, this.inputTarget.f293235id, this.textInputChannel, this.scribeChannel, keyboardManager, this.mEditable, editorInfo);
        editorInfo.initialSelStart = this.mEditable.getSelectionStart();
        editorInfo.initialSelEnd = this.mEditable.getSelectionEnd();
        this.lastInputConnection = inputConnectionAdaptor;
        return inputConnectionAdaptor;
    }

    public void destroy() {
        this.platformViewsController.detachTextInputPlugin();
        this.platformViewsController2.detachTextInputPlugin();
        this.textInputChannel.setTextInputMethodHandler(null);
        notifyViewExited();
        this.mEditable.removeEditingStateListener(this);
        io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.imeSyncCallback;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r7 == r1.composingEnd) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    @Override // io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void didChangeEditingState(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto Lb
            io.flutter.plugin.editing.ListenableEditingState r9 = r8.mEditable
            java.lang.String r9 = r9.toString()
            r8.notifyValueChanged(r9)
        Lb:
            io.flutter.plugin.editing.ListenableEditingState r9 = r8.mEditable
            int r9 = r9.getSelectionStart()
            io.flutter.plugin.editing.ListenableEditingState r10 = r8.mEditable
            int r10 = r10.getSelectionEnd()
            io.flutter.plugin.editing.ListenableEditingState r11 = r8.mEditable
            int r11 = r11.getComposingStart()
            io.flutter.plugin.editing.ListenableEditingState r0 = r8.mEditable
            int r7 = r0.getComposingEnd()
            io.flutter.plugin.editing.ListenableEditingState r0 = r8.mEditable
            java.util.ArrayList r0 = r0.extractBatchTextEditingDeltas()
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r1 = r8.mLastKnownFrameworkTextEditingState
            if (r1 == 0) goto L52
            io.flutter.plugin.editing.ListenableEditingState r1 = r8.mEditable
            java.lang.String r1 = r1.toString()
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r2 = r8.mLastKnownFrameworkTextEditingState
            java.lang.String r2 = r2.text
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L50
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r1 = r8.mLastKnownFrameworkTextEditingState
            int r2 = r1.selectionStart
            if (r9 != r2) goto L50
            int r2 = r1.selectionEnd
            if (r10 != r2) goto L50
            int r2 = r1.composingStart
            if (r11 != r2) goto L50
            int r1 = r1.composingEnd
            if (r7 != r1) goto L50
            goto L52
        L50:
            r1 = 0
            goto L53
        L52:
            r1 = 1
        L53:
            if (r1 != 0) goto La9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "send EditingState to flutter: "
            r1.<init>(r2)
            io.flutter.plugin.editing.ListenableEditingState r2 = r8.mEditable
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            io.flutter.Log.v(r2, r1)
            io.flutter.embedding.engine.systemchannels.TextInputChannel$Configuration r1 = r8.configuration
            boolean r1 = r1.enableDeltaModel
            if (r1 == 0) goto L83
            io.flutter.embedding.engine.systemchannels.TextInputChannel r1 = r8.textInputChannel
            io.flutter.plugin.editing.TextInputPlugin$InputTarget r2 = r8.inputTarget
            int r2 = r2.f293235id
            r1.updateEditingStateWithDeltas(r2, r0)
            io.flutter.plugin.editing.ListenableEditingState r0 = r8.mEditable
            r0.clearBatchDeltas()
            goto L96
        L83:
            io.flutter.embedding.engine.systemchannels.TextInputChannel r0 = r8.textInputChannel
            io.flutter.plugin.editing.TextInputPlugin$InputTarget r1 = r8.inputTarget
            int r1 = r1.f293235id
            io.flutter.plugin.editing.ListenableEditingState r2 = r8.mEditable
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.updateEditingState(r1, r2, r3, r4, r5, r6)
        L96:
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r6 = new io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState
            io.flutter.plugin.editing.ListenableEditingState r0 = r8.mEditable
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.mLastKnownFrameworkTextEditingState = r6
            goto Lae
        La9:
            io.flutter.plugin.editing.ListenableEditingState r9 = r8.mEditable
            r9.clearBatchDeltas()
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.TextInputPlugin.didChangeEditingState(boolean, boolean, boolean):void");
    }

    public android.text.Editable getEditable() {
        return this.mEditable;
    }

    public io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback getImeSyncCallback() {
        return this.imeSyncCallback;
    }

    public android.view.inputmethod.InputMethodManager getInputMethodManager() {
        return this.mImm;
    }

    public android.view.inputmethod.InputConnection getLastInputConnection() {
        return this.lastInputConnection;
    }

    public boolean handleKeyEvent(android.view.KeyEvent keyEvent) {
        android.view.inputmethod.InputConnection inputConnection;
        if (!getInputMethodManager().isAcceptingText() || (inputConnection = this.lastInputConnection) == null) {
            return false;
        }
        return inputConnection instanceof io.flutter.plugin.editing.InputConnectionAdaptor ? ((io.flutter.plugin.editing.InputConnectionAdaptor) inputConnection).handleKeyEvent(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void lockPlatformViewInputConnection() {
        if (this.inputTarget.type == io.flutter.plugin.editing.TextInputPlugin.InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.isInputConnectionLocked = true;
        }
    }

    public void onProvideAutofillVirtualStructure(android.view.ViewStructure viewStructure, int i17) {
        android.graphics.Rect rect;
        if (android.os.Build.VERSION.SDK_INT < 26 || !needsAutofill()) {
            return;
        }
        java.lang.String str = this.configuration.autofill.uniqueIdentifier;
        android.view.autofill.AutofillId autofillId = viewStructure.getAutofillId();
        for (int i18 = 0; i18 < this.autofillConfiguration.size(); i18++) {
            int keyAt = this.autofillConfiguration.keyAt(i18);
            io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill autofill = this.autofillConfiguration.valueAt(i18).autofill;
            if (autofill != null) {
                viewStructure.addChildCount(1);
                android.view.ViewStructure newChild = viewStructure.newChild(i18);
                newChild.setAutofillId(autofillId, keyAt);
                java.lang.String[] strArr = autofill.hints;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                java.lang.String str2 = autofill.hintText;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = this.lastClientRect) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    newChild.setAutofillValue(android.view.autofill.AutofillValue.forText(autofill.editState.text));
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.lastClientRect.height());
                    newChild.setAutofillValue(android.view.autofill.AutofillValue.forText(this.mEditable));
                }
            }
        }
    }

    public void sendTextInputAppPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        this.mImm.sendAppPrivateCommand(this.mView, str, bundle);
    }

    public void setTextInputClient(int i17, io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration) {
        notifyViewExited();
        this.configuration = configuration;
        this.inputTarget = new io.flutter.plugin.editing.TextInputPlugin.InputTarget(io.flutter.plugin.editing.TextInputPlugin.InputTarget.Type.FRAMEWORK_CLIENT, i17);
        this.mEditable.removeEditingStateListener(this);
        io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill autofill = configuration.autofill;
        this.mEditable = new io.flutter.plugin.editing.ListenableEditingState(autofill != null ? autofill.editState : null, this.mView);
        updateAutofillConfigurationIfNeeded(configuration);
        this.mRestartInputPending = true;
        unlockPlatformViewInputConnection();
        this.lastClientRect = null;
        this.mEditable.addEditingStateListener(this);
    }

    public void setTextInputEditingState(android.view.View view, io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState textEditState) {
        io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState textEditState2;
        if (!this.mRestartInputPending && (textEditState2 = this.mLastKnownFrameworkTextEditingState) != null && textEditState2.hasComposing()) {
            boolean composingChanged = composingChanged(this.mLastKnownFrameworkTextEditingState, textEditState);
            this.mRestartInputPending = composingChanged;
            if (composingChanged) {
                io.flutter.Log.i(TAG, "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.mLastKnownFrameworkTextEditingState = textEditState;
        this.mEditable.setEditingState(textEditState);
        if (this.mRestartInputPending) {
            this.mImm.restartInput(view);
            this.mRestartInputPending = false;
        }
    }

    public void setWxKeyboardAction(io.flutter.plugin.editing.WxKeyboardAction wxKeyboardAction) {
        this.mWxKeyboardAction = wxKeyboardAction;
    }

    public void showTextInput(android.view.View view) {
        io.flutter.embedding.engine.systemchannels.TextInputChannel.InputType inputType;
        io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration = this.configuration;
        if (configuration != null && (inputType = configuration.inputType) != null && inputType.type == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.NONE) {
            hideTextInput(view);
        } else {
            view.requestFocus();
            this.mImm.showSoftInput(view, 0);
        }
    }

    public void unlockPlatformViewInputConnection() {
        if (this.inputTarget.type == io.flutter.plugin.editing.TextInputPlugin.InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.isInputConnectionLocked = false;
        }
    }
}
