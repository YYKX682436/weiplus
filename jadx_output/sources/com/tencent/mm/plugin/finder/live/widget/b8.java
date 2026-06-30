package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class b8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.i8 f117849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(com.tencent.mm.plugin.finder.live.widget.i8 i8Var) {
        super(0);
        this.f117849d = i8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        android.text.Editable text;
        com.tencent.mm.plugin.finder.live.widget.i8 i8Var = this.f117849d;
        android.widget.EditText editText = i8Var.f118649J;
        if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        if (str.length() == 0) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = i8Var.K;
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
        } else {
            kotlinx.coroutines.r2 r2Var = i8Var.U;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            i8Var.U = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.finder.live.widget.a8(i8Var, str, null), 3, null);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = i8Var.K;
            if (weImageView2 != null) {
                weImageView2.setVisibility(0);
            }
            android.widget.TextView textView = i8Var.S;
            if (textView == null) {
                kotlin.jvm.internal.o.o("tvCancel");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(textView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget$initContentView$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget$initContentView$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
