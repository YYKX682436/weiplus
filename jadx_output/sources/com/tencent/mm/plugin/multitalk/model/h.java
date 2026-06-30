package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f149989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sj3.j f149990e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i17, sj3.j jVar) {
        super(0);
        this.f149989d = i17;
        this.f149990e = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f149989d;
        boolean z17 = i17 == 1 || i17 == 3;
        sj3.j jVar = this.f149990e;
        if (z17 != jVar.f408591u) {
            jVar.f408591u = z17;
            boolean z18 = !z17;
            if (jVar.f408595y == -1) {
                java.lang.Object systemService = jVar.itemView.getContext().getSystemService("layout_inflater");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                android.view.View inflate = ((android.view.LayoutInflater) systemService).inflate(com.tencent.mm.R.layout.c3i, (android.view.ViewGroup) jVar.f408590t, false);
                kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                if (!z18) {
                    android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.jwu);
                    if (imageView != null) {
                        imageView.setBackgroundResource(com.tencent.mm.R.drawable.bdt);
                    }
                    android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jwv);
                    if (textView != null) {
                        textView.setText(com.tencent.mm.R.string.h2s);
                    }
                    inflate.setRotation(90.0f);
                }
                jVar.f408595y = 4;
                jVar.l(inflate, jVar.itemView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479667c4), jVar.itemView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479667c4), false);
                ((ku5.t0) ku5.t0.f312615d).k(new sj3.g(jVar), 3000);
            }
        }
        return jz5.f0.f302826a;
    }
}
