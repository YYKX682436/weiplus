package mo1;

/* loaded from: classes14.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLitePackageListUI f330329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f330331f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f330332g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLitePackageListUI roamLitePackageListUI, java.lang.String str, yz5.a aVar, int i17) {
        super(2);
        this.f330329d = roamLitePackageListUI;
        this.f330330e = str;
        this.f330331f = aVar;
        this.f330332g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f330332g | 1;
        java.lang.String str = this.f330330e;
        yz5.a aVar = this.f330331f;
        this.f330329d.T6(str, aVar, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
