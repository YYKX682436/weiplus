package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class a4 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b4 f116896d;

    public a4(com.tencent.mm.plugin.finder.live.viewmodel.b4 b4Var) {
        this.f116896d = b4Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.plugin.finder.live.viewmodel.b4 b4Var = this.f116896d;
        int i17 = b4Var.f116924h;
        if (i17 > 0) {
            b4Var.f116924h = i17 - 1;
            android.widget.TextView textView = b4Var.f116922f;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.widget.TextView textView2 = b4Var.f116922f;
            if (textView2 != null) {
                textView2.setText(java.lang.String.valueOf(b4Var.f116924h));
            }
            return true;
        }
        yz5.l lVar = b4Var.f116920d;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        az2.f fVar = b4Var.f116923g;
        if (fVar != null) {
            fVar.a();
        }
        android.widget.TextView textView3 = b4Var.f116922f;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        android.widget.Button button = b4Var.f116921e;
        if (button == null) {
            return false;
        }
        button.setVisibility(8);
        return false;
    }
}
