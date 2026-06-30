package m00;

/* loaded from: classes9.dex */
public final class c implements b30.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f322528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.ecs.EcsAddressStruct f322529b;

    public c(yz5.l lVar, com.tencent.pigeon.ecs.EcsAddressStruct ecsAddressStruct) {
        this.f322528a = lVar;
        this.f322529b = ecsAddressStruct;
    }

    @Override // b30.e
    public boolean a(int i17, int i18, android.content.Intent intent) {
        if (4361 != i17) {
            return false;
        }
        if (-1 != i18) {
            return true;
        }
        com.tencent.pigeon.ecs.EcsAddressStruct a17 = m00.f.a(m00.f.f322532a, intent);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f322528a.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ecs.EcsAddressStruct(a17.getUserName(), a17.getPostalCode(), a17.getNationalCode(), a17.getTelNumber(), a17.getProvince(), a17.getCity(), a17.getCounty(), a17.getStreet(), a17.getDetail(), null, this.f322529b.getAddressId(), null, 2560, null))));
        return true;
    }
}
