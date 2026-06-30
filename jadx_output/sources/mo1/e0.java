package mo1;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLitePackageListUI f330279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f330280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f330281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f330282g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLitePackageListUI roamLitePackageListUI, java.util.List list, yz5.p pVar, int i17) {
        super(2);
        this.f330279d = roamLitePackageListUI;
        this.f330280e = list;
        this.f330281f = pVar;
        this.f330282g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f330282g | 1;
        int i18 = com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLitePackageListUI.f92709f;
        java.util.List list = this.f330280e;
        yz5.p pVar = this.f330281f;
        this.f330279d.U6(list, pVar, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
