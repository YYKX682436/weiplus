package uf;

/* loaded from: classes7.dex */
public final class s1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f427100d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ProgressBar f427101e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(uf.v1 v1Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.opp);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f427100d = textView;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.f486290kt2);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f427101e = (android.widget.ProgressBar) findViewById2;
        zk1.m.f473414l.a(itemView, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? false : true, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.s(textView, 1);
    }
}
