package so2;

/* loaded from: classes2.dex */
public final class k0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.x80 f410452d;

    public k0(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        this.f410452d = draftItem;
    }

    public final long a() {
        java.lang.Long l17;
        com.tencent.mm.plugin.finder.storage.x80 x80Var = this.f410452d;
        if (x80Var.u0()) {
            ni0.h hVar = x80Var.M;
            return ((hVar == null || (l17 = hVar.f337224b) == null) ? c01.id.a() : l17.longValue()) / 1000;
        }
        long createTime = x80Var.t0().getCreateTime();
        return createTime <= 0 ? x80Var.field_createTime : createTime;
    }

    public final java.lang.String b() {
        r45.ef2 mvInfo;
        boolean c17 = c();
        r45.hf2 hf2Var = null;
        com.tencent.mm.plugin.finder.storage.x80 x80Var = this.f410452d;
        if (!c17) {
            if (x80Var.u0()) {
                ni0.h hVar = x80Var.M;
                if (hVar != null) {
                    return hVar.f337225c;
                }
                return null;
            }
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = x80Var.t0().getFeedObject().getObjectDesc();
            if (objectDesc != null) {
                return objectDesc.getDescription();
            }
            return null;
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = x80Var.t0().getFeedObject().getObjectDesc();
        if (objectDesc2 != null && (mvInfo = objectDesc2.getMvInfo()) != null) {
            hf2Var = (r45.hf2) mvInfo.getCustom(1);
        }
        if (hf2Var == null) {
            return "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(hf2Var.getString(1))) {
            java.lang.String string = hf2Var.getString(0);
            return string == null ? "" : string;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(hf2Var.getString(0))) {
            return java.lang.String.valueOf(hf2Var.getString(1));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String string2 = hf2Var.getString(0);
        sb6.append(string2 != null ? string2 : "");
        sb6.append('-');
        sb6.append(hf2Var.getString(1));
        return sb6.toString();
    }

    public final boolean c() {
        return this.f410452d.field_objectType == 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        so2.k0 k0Var = obj instanceof so2.k0 ? (so2.k0) obj : null;
        if (k0Var == null) {
            return -1;
        }
        com.tencent.mm.plugin.finder.storage.x80 x80Var = k0Var.f410452d;
        long j17 = x80Var.field_localId;
        com.tencent.mm.plugin.finder.storage.x80 x80Var2 = this.f410452d;
        if (j17 > 0) {
            long j18 = x80Var2.field_localId;
            if (j18 > 0 && j17 == j18) {
                return 0;
            }
        }
        long j19 = x80Var2.field_objectId;
        if (j19 == 0) {
            return -1;
        }
        long j27 = x80Var.field_objectId;
        return (j27 == 0 || j19 != j27) ? -1 : 0;
    }

    @Override // in5.c
    public long getItemId() {
        com.tencent.mm.plugin.finder.storage.x80 x80Var = this.f410452d;
        long j17 = x80Var.field_localId;
        return j17 != 0 ? j17 : x80Var.field_objectId;
    }

    @Override // in5.c
    public int h() {
        return this.f410452d.field_objectType;
    }
}
