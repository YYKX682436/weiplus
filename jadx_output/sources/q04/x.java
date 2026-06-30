package q04;

/* loaded from: classes12.dex */
public final class x implements o04.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f359409b;

    public x(java.lang.String str, int i17) {
        this.f359408a = str;
        this.f359409b = i17;
    }

    @Override // o04.q
    public void a(int i17, boolean z17, dm.ba baVar, com.tencent.mm.protobuf.f fVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SecRecoveryDataService", "postReportByTextStatusEditActivity onActionDone " + i17 + ' ' + z17 + ' ');
        com.tencent.mm.sdk.platformtools.o4.M("recovery_storage").D("recovery_data_id", this.f359408a);
        com.tencent.mm.sdk.platformtools.o4.M("recovery_storage").A("recovery_data_type", this.f359409b);
    }
}
