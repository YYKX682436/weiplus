package cv0;

/* loaded from: classes5.dex */
public final class j extends cv0.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(cv0.d handleBoxChange, dv0.a handleBoxCallback) {
        super(handleBoxChange, true, handleBoxCallback);
        kotlin.jvm.internal.o.g(handleBoxChange, "handleBoxChange");
        kotlin.jvm.internal.o.g(handleBoxCallback, "handleBoxCallback");
    }

    @Override // cv0.c, au0.a
    public boolean i(com.tencent.maas.base.MJID itemID) {
        kotlin.jvm.internal.o.g(itemID, "itemID");
        au0.b o66 = this.f222528c.o6(itemID);
        if (o66 == null || !o66.isEnable()) {
            return false;
        }
        itemID.toString();
        return true;
    }
}
