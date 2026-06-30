package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class ga extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.ka f116331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f116332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f116333f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(com.tencent.mm.plugin.finder.live.view.ka kaVar, int i17, int i18) {
        super(0);
        this.f116331d = kaVar;
        this.f116332e = i17;
        this.f116333f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String string;
        com.tencent.mm.plugin.finder.live.view.ka kaVar = this.f116331d;
        android.widget.TextView textView = kaVar.N;
        if (textView != null) {
            android.content.Context context = kaVar.f118183e;
            int i17 = this.f116332e;
            java.lang.String str = "";
            if (i17 == 4) {
                string = context.getResources().getString(com.tencent.mm.R.string.e8u);
            } else if (i17 == 7) {
                string = context.getResources().getString(com.tencent.mm.R.string.e8x);
            } else if (i17 == 15) {
                string = context.getResources().getString(com.tencent.mm.R.string.e8v);
            } else if (i17 != 999) {
                switch (i17) {
                    case 18:
                        string = context.getResources().getString(com.tencent.mm.R.string.m3o);
                        break;
                    case 19:
                        string = context.getResources().getString(com.tencent.mm.R.string.m5r);
                        break;
                    case 20:
                        string = context.getResources().getString(com.tencent.mm.R.string.fba);
                        break;
                    default:
                        string = "";
                        break;
                }
            } else {
                string = context.getResources().getString(com.tencent.mm.R.string.e8w);
            }
            kotlin.jvm.internal.o.d(string);
            if (string.length() > 0) {
                int i18 = this.f116333f;
                if (i18 > 0) {
                    str = string + " (" + i18 + ')';
                } else {
                    str = string;
                }
            }
            textView.setText(str);
        }
        return jz5.f0.f302826a;
    }
}
