package mo1;

/* loaded from: classes10.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLitePackageListUI f330340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f330341e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLitePackageListUI roamLitePackageListUI, int i17) {
        super(2);
        this.f330340d = roamLitePackageListUI;
        this.f330341e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f330341e | 1;
        com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLitePackageListUI.V6(this.f330340d, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
