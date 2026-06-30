package f53;

/* loaded from: classes5.dex */
public final class a0 implements fl5.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI f259633a;

    public a0(com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI) {
        this.f259633a = postCommentDialogUI;
    }

    @Override // fl5.h
    public void a(int i17, int i18, android.text.Layout layout) {
        if (i17 > i18) {
            return;
        }
        com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI = this.f259633a;
        for (java.util.Map.Entry entry : postCommentDialogUI.D.f259691e.entrySet()) {
            if (i17 > ((java.lang.Number) ((jz5.l) entry.getValue()).f302833d).intValue() && i17 <= ((java.lang.Number) ((jz5.l) entry.getValue()).f302834e).intValue()) {
                if (i17 != i18) {
                    com.tencent.mm.ui.widget.MMEditText mMEditText = postCommentDialogUI.f140012e;
                    if (mMEditText != null) {
                        mMEditText.setSelection(((java.lang.Number) ((jz5.l) entry.getValue()).f302834e).intValue(), i18);
                        return;
                    } else {
                        kotlin.jvm.internal.o.o("gameCommentInputTxt");
                        throw null;
                    }
                }
                int intValue = ((java.lang.Number) ((jz5.l) entry.getValue()).f302834e).intValue();
                com.tencent.mm.ui.widget.MMEditText mMEditText2 = postCommentDialogUI.f140012e;
                if (mMEditText2 == null) {
                    kotlin.jvm.internal.o.o("gameCommentInputTxt");
                    throw null;
                }
                if (intValue <= mMEditText2.getText().length()) {
                    com.tencent.mm.ui.widget.MMEditText mMEditText3 = postCommentDialogUI.f140012e;
                    if (mMEditText3 != null) {
                        mMEditText3.setSelection(intValue);
                        return;
                    } else {
                        kotlin.jvm.internal.o.o("gameCommentInputTxt");
                        throw null;
                    }
                }
                return;
            }
            if (i18 > ((java.lang.Number) ((jz5.l) entry.getValue()).f302833d).intValue() && i18 <= ((java.lang.Number) ((jz5.l) entry.getValue()).f302834e).intValue()) {
                com.tencent.mm.ui.widget.MMEditText mMEditText4 = postCommentDialogUI.f140012e;
                if (mMEditText4 != null) {
                    mMEditText4.setSelection(i17, ((java.lang.Number) ((jz5.l) entry.getValue()).f302833d).intValue());
                    return;
                } else {
                    kotlin.jvm.internal.o.o("gameCommentInputTxt");
                    throw null;
                }
            }
        }
    }
}
