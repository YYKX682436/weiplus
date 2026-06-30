package m31;

/* loaded from: classes9.dex */
public final class s0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f323209d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f323210e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMSwitchBtn f323211f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(android.view.View item) {
        super(item);
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.f484050cu2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f323209d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = this.itemView.findViewById(com.tencent.mm.R.id.gcl);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f323210e = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = this.itemView.findViewById(com.tencent.mm.R.id.nsz);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById3;
        this.f323211f = mMSwitchBtn;
        zk1.m.f473414l.a(mMSwitchBtn, (r27 & 2) != 0 ? null : android.widget.Switch.class, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : java.lang.Boolean.FALSE, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : new m31.r0(this), (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
    }
}
