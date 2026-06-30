package ns4;

/* loaded from: classes8.dex */
public final class o implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ns4.s f339601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339602b;

    public o(ns4.s sVar, java.lang.String str) {
        this.f339601a = sVar;
        this.f339602b = str;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public final void onClick(android.view.View view) {
        ns4.s sVar = this.f339601a;
        sVar.f339640e.O6(8);
        com.tencent.mm.wallet_core.ui.r1.V(sVar.f339636a, this.f339602b, true);
    }
}
