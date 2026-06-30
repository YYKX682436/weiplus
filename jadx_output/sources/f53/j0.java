package f53;

/* loaded from: classes5.dex */
public final class j0 implements al5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI f259661d;

    public j0(com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI) {
        this.f259661d = postCommentDialogUI;
    }

    @Override // al5.e0
    public final void J2(boolean z17, int i17) {
        com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI = this.f259661d;
        postCommentDialogUI.A = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.PostCommentDialogUI", "isKeyboardShow  = " + z17 + "   keyboardHeight = " + i17);
        com.tencent.mm.ui.widget.MMEditText mMEditText = postCommentDialogUI.f140012e;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        mMEditText.m(z17);
        if (postCommentDialogUI.B) {
            com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig = postCommentDialogUI.f140023s;
            java.lang.String str = gameInputConfig != null ? gameInputConfig.identifier : null;
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = postCommentDialogUI.f140012e;
            if (mMEditText2 == null) {
                kotlin.jvm.internal.o.o("gameCommentInputTxt");
                throw null;
            }
            java.lang.String obj = mMEditText2.getText().toString();
            com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = postCommentDialogUI.f140014g;
            if (inputPanelLinearLayout == null) {
                kotlin.jvm.internal.o.o("linearRoot");
                throw null;
            }
            int height = inputPanelLinearLayout.getHeight();
            com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout2 = postCommentDialogUI.f140014g;
            if (inputPanelLinearLayout2 == null) {
                kotlin.jvm.internal.o.o("linearRoot");
                throw null;
            }
            int paddingBottom = height - inputPanelLinearLayout2.getPaddingBottom();
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.w9.f193055c;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.tencent.live.TXLivePluginDef.ParamKey.CALL_MANAGER_ID_KEY, str);
            bundle.putBoolean("isKeyboardShow", z17);
            bundle.putString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, obj);
            bundle.putInt("inputHeight", paddingBottom);
            com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout3 = postCommentDialogUI.f140014g;
            if (inputPanelLinearLayout3 == null) {
                kotlin.jvm.internal.o.o("linearRoot");
                throw null;
            }
            bundle.putInt("inputTop", inputPanelLinearLayout3.getHeight());
            com.tencent.mm.ipcinvoker.d0.d(str2, bundle, com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI.d.class, null);
        } else {
            m33.y0 y0Var = m33.x0.f323344a;
            com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig2 = postCommentDialogUI.f140023s;
            java.lang.String str3 = gameInputConfig2 != null ? gameInputConfig2.identifier : null;
            com.tencent.mm.ui.widget.MMEditText mMEditText3 = postCommentDialogUI.f140012e;
            if (mMEditText3 == null) {
                kotlin.jvm.internal.o.o("gameCommentInputTxt");
                throw null;
            }
            java.lang.String obj2 = mMEditText3.getText().toString();
            com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout4 = postCommentDialogUI.f140014g;
            if (inputPanelLinearLayout4 == null) {
                kotlin.jvm.internal.o.o("linearRoot");
                throw null;
            }
            int height2 = inputPanelLinearLayout4.getHeight();
            com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout5 = postCommentDialogUI.f140014g;
            if (inputPanelLinearLayout5 == null) {
                kotlin.jvm.internal.o.o("linearRoot");
                throw null;
            }
            m33.u0 u0Var = new m33.u0(obj2, 0, height2 - inputPanelLinearLayout5.getPaddingBottom(), z17);
            m33.w0 w0Var = (m33.w0) y0Var.f323345a.get(str3);
            if (w0Var != null) {
                w0Var.b(u0Var);
            }
        }
        if (z17) {
            postCommentDialogUI.X6().setVisibility(0);
            com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout6 = postCommentDialogUI.f140014g;
            if (inputPanelLinearLayout6 == null) {
                kotlin.jvm.internal.o.o("linearRoot");
                throw null;
            }
            inputPanelLinearLayout6.setPadding(0, 0, 0, i17);
        } else {
            postCommentDialogUI.Y6();
            postCommentDialogUI.X6().setVisibility(8);
            com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout7 = postCommentDialogUI.f140014g;
            if (inputPanelLinearLayout7 == null) {
                kotlin.jvm.internal.o.o("linearRoot");
                throw null;
            }
            inputPanelLinearLayout7.setPadding(0, 0, 0, 0);
        }
        if (postCommentDialogUI.f140030z) {
            postCommentDialogUI.b7();
            postCommentDialogUI.f140030z = false;
        }
    }
}
