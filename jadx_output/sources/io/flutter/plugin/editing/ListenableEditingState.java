package io.flutter.plugin.editing;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class ListenableEditingState extends android.text.SpannableStringBuilder {
    private static final java.lang.String TAG = "ListenableEditingState";
    private int mComposingEndWhenBeginBatchEdit;
    private int mComposingStartWhenBeginBatchEdit;
    private android.view.inputmethod.BaseInputConnection mDummyConnection;
    private int mSelectionEndWhenBeginBatchEdit;
    private int mSelectionStartWhenBeginBatchEdit;
    private java.lang.String mTextWhenBeginBatchEdit;
    private java.lang.String mToStringCache;
    private int mBatchEditNestDepth = 0;
    private int mChangeNotificationDepth = 0;
    private java.util.ArrayList<io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher> mListeners = new java.util.ArrayList<>();
    private java.util.ArrayList<io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher> mPendingListeners = new java.util.ArrayList<>();
    private java.util.ArrayList<io.flutter.plugin.editing.TextEditingDelta> mBatchTextEditingDeltas = new java.util.ArrayList<>();
    private boolean mIgnoreSpanSelectionUpdate = false;

    /* loaded from: classes15.dex */
    public interface EditingStateWatcher {
        void didChangeEditingState(boolean z17, boolean z18, boolean z19);
    }

    public ListenableEditingState(io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState textEditState, android.view.View view) {
        this.mDummyConnection = new android.view.inputmethod.BaseInputConnection(view, true) { // from class: io.flutter.plugin.editing.ListenableEditingState.1
            @Override // android.view.inputmethod.BaseInputConnection
            public android.text.Editable getEditable() {
                return this;
            }
        };
        if (textEditState != null) {
            setEditingState(textEditState);
        }
    }

    private void notifyListener(io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher editingStateWatcher, boolean z17, boolean z18, boolean z19) {
        this.mChangeNotificationDepth++;
        editingStateWatcher.didChangeEditingState(z17, z18, z19);
        this.mChangeNotificationDepth--;
    }

    private void notifyListenersIfNeeded(boolean z17, boolean z18, boolean z19) {
        if (z17 || z18 || z19) {
            java.util.Iterator<io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher> it = this.mListeners.iterator();
            while (it.hasNext()) {
                notifyListener(it.next(), z17, z18, z19);
            }
        }
    }

    public void addEditingStateListener(io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher editingStateWatcher) {
        if (this.mChangeNotificationDepth > 0) {
            io.flutter.Log.e(TAG, "adding a listener " + editingStateWatcher.toString() + " in a listener callback");
        }
        if (this.mBatchEditNestDepth <= 0) {
            this.mListeners.add(editingStateWatcher);
        } else {
            io.flutter.Log.w(TAG, "a listener was added to EditingState while a batch edit was in progress");
            this.mPendingListeners.add(editingStateWatcher);
        }
    }

    public void beginBatchEdit() {
        this.mBatchEditNestDepth++;
        if (this.mChangeNotificationDepth > 0) {
            io.flutter.Log.e(TAG, "editing state should not be changed in a listener callback");
        }
        if (this.mBatchEditNestDepth != 1 || this.mListeners.isEmpty()) {
            return;
        }
        this.mTextWhenBeginBatchEdit = toString();
        this.mSelectionStartWhenBeginBatchEdit = getSelectionStart();
        this.mSelectionEndWhenBeginBatchEdit = getSelectionEnd();
        this.mComposingStartWhenBeginBatchEdit = getComposingStart();
        this.mComposingEndWhenBeginBatchEdit = getComposingEnd();
    }

    public void clearBatchDeltas() {
        this.mBatchTextEditingDeltas.clear();
    }

    public void endBatchEdit() {
        int i17 = this.mBatchEditNestDepth;
        if (i17 == 0) {
            io.flutter.Log.e(TAG, "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i17 == 1) {
            java.util.Iterator<io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher> it = this.mPendingListeners.iterator();
            while (it.hasNext()) {
                notifyListener(it.next(), true, true, true);
            }
            if (!this.mListeners.isEmpty()) {
                io.flutter.Log.v(TAG, "didFinishBatchEdit with " + java.lang.String.valueOf(this.mListeners.size()) + " listener(s)");
                boolean equals = toString().equals(this.mTextWhenBeginBatchEdit) ^ true;
                boolean z17 = (this.mSelectionStartWhenBeginBatchEdit == getSelectionStart() && this.mSelectionEndWhenBeginBatchEdit == getSelectionEnd()) ? false : true;
                boolean z18 = (this.mComposingStartWhenBeginBatchEdit == getComposingStart() && this.mComposingEndWhenBeginBatchEdit == getComposingEnd()) ? false : true;
                io.flutter.Log.d(TAG, "endBatchEdit mSelectionStartWhenBeginBatchEdit: " + this.mSelectionStartWhenBeginBatchEdit + ", mSelectionEndWhenBeginBatchEdit: " + this.mSelectionEndWhenBeginBatchEdit + ", mComposingStartWhenBeginBatchEdit: " + this.mComposingStartWhenBeginBatchEdit + ", mComposingEndWhenBeginBatchEdit: " + this.mComposingEndWhenBeginBatchEdit);
                notifyListenersIfNeeded(equals, z17, z18);
            }
        }
        this.mListeners.addAll(this.mPendingListeners);
        this.mPendingListeners.clear();
        this.mBatchEditNestDepth--;
    }

    public java.util.ArrayList<io.flutter.plugin.editing.TextEditingDelta> extractBatchTextEditingDeltas() {
        java.util.ArrayList<io.flutter.plugin.editing.TextEditingDelta> arrayList = new java.util.ArrayList<>(this.mBatchTextEditingDeltas);
        this.mBatchTextEditingDeltas.clear();
        return arrayList;
    }

    public final int getComposingEnd() {
        return android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int getComposingStart() {
        return android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this);
    }

    public final int getSelectionEnd() {
        return android.text.Selection.getSelectionEnd(this);
    }

    public final int getSelectionStart() {
        return android.text.Selection.getSelectionStart(this);
    }

    public void removeEditingStateListener(io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher editingStateWatcher) {
        if (this.mChangeNotificationDepth > 0) {
            io.flutter.Log.e(TAG, "removing a listener " + editingStateWatcher.toString() + " in a listener callback");
        }
        this.mListeners.remove(editingStateWatcher);
        if (this.mBatchEditNestDepth > 0) {
            this.mPendingListeners.remove(editingStateWatcher);
        }
    }

    public void setComposingRange(int i17, int i18) {
        if (i17 < 0 || i17 >= i18) {
            android.view.inputmethod.BaseInputConnection.removeComposingSpans(this);
        } else {
            this.mDummyConnection.setComposingRegion(i17, i18);
        }
    }

    public void setEditingState(io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState textEditState) {
        beginBatchEdit();
        replace(0, length(), (java.lang.CharSequence) textEditState.text);
        if (textEditState.hasSelection()) {
            android.text.Selection.setSelection(this, textEditState.selectionStart, textEditState.selectionEnd);
        } else {
            android.text.Selection.removeSelection(this);
        }
        setComposingRange(textEditState.composingStart, textEditState.composingEnd);
        clearBatchDeltas();
        endBatchEdit();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(java.lang.Object obj, int i17, int i18, int i19) {
        super.setSpan(obj, i17, i18, i19);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public java.lang.String toString() {
        java.lang.String str = this.mToStringCache;
        if (str != null) {
            return str;
        }
        java.lang.String spannableStringBuilder = super.toString();
        this.mToStringCache = spannableStringBuilder;
        return spannableStringBuilder;
    }

    public void updateTextInputSelectionState(java.util.Map<java.lang.String, java.lang.Integer> map) {
        int length = toString().length();
        int min = java.lang.Math.min(map.get("selectionBase") != null ? map.get("selectionBase").intValue() : 0, length);
        int min2 = java.lang.Math.min(map.get("selectionExtent") != null ? map.get("selectionExtent").intValue() : 0, length);
        this.mSelectionStartWhenBeginBatchEdit = min;
        this.mSelectionEndWhenBeginBatchEdit = min2;
        this.mIgnoreSpanSelectionUpdate = true;
        android.text.Selection.setSelection(this, min, min2);
        this.mIgnoreSpanSelectionUpdate = false;
        io.flutter.Log.d(TAG, "updateTextInputSelectionState (" + min + "," + min2 + "), text length: " + length + ", selectionBase=" + map.get("selectionBase") + ", selectionExtent=" + map.get("selectionExtent"));
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder replace(int i17, int i18, java.lang.CharSequence charSequence, int i19, int i27) {
        boolean z17;
        boolean z18;
        if (this.mChangeNotificationDepth > 0) {
            io.flutter.Log.e(TAG, "editing state should not be changed in a listener callback");
        }
        java.lang.String listenableEditingState = toString();
        int i28 = i18 - i17;
        boolean z19 = i28 != i27 - i19;
        for (int i29 = 0; i29 < i28 && !z19; i29++) {
            z19 |= charAt(i17 + i29) != charSequence.charAt(i19 + i29);
        }
        if (z19) {
            this.mToStringCache = null;
        }
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        int composingStart = getComposingStart();
        int composingEnd = getComposingEnd();
        android.text.SpannableStringBuilder replace = super.replace(i17, i18, charSequence, i19, i27);
        boolean z27 = z19;
        this.mBatchTextEditingDeltas.add(new io.flutter.plugin.editing.TextEditingDelta(listenableEditingState, i17, i18, charSequence, getSelectionStart(), getSelectionEnd(), getComposingStart(), getComposingEnd()));
        if (this.mBatchEditNestDepth > 0) {
            return replace;
        }
        boolean z28 = (getSelectionStart() == selectionStart && getSelectionEnd() == selectionEnd) ? false : true;
        if (getComposingStart() == composingStart && getComposingEnd() == composingEnd) {
            z17 = z27;
            z18 = false;
        } else {
            z17 = z27;
            z18 = true;
        }
        notifyListenersIfNeeded(z17, z28, z18);
        return replace;
    }
}
