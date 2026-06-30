package ut2;

/* loaded from: classes3.dex */
public final class i2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f430918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(android.view.View view) {
        super(0);
        this.f430918d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView = (com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView) this.f430918d.findViewById(com.tencent.mm.R.id.l7m);
        kotlin.jvm.internal.o.d(finderLiveProductRecordView);
        finderLiveProductRecordView.post(new d92.b(new d92.c(finderLiveProductRecordView, true)));
        return finderLiveProductRecordView;
    }
}
