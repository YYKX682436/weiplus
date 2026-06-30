package no2;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ no2.c f338737d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(no2.c cVar) {
        super(0);
        this.f338737d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f338737d.f338744d;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.onChanged();
        }
        return jz5.f0.f302826a;
    }
}
