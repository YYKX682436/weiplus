package so2;

/* loaded from: classes2.dex */
public class q2 extends so2.u1 {

    /* renamed from: p, reason: collision with root package name */
    public static final so2.p2 f410546p = new so2.p2(null);

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f410547i;

    /* renamed from: m, reason: collision with root package name */
    public final int f410548m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f410549n;

    /* renamed from: o, reason: collision with root package name */
    public int f410550o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(com.tencent.mm.protocal.protobuf.FinderObject finderItem, int i17) {
        super(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderItem, i17));
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        this.f410547i = finderItem;
        this.f410548m = i17;
        this.f410549n = getFeedObject().getFeedObject();
        getUdfKv().put("page_type", "profile_live_replay");
    }

    @Override // com.tencent.mm.plugin.finder.model.BaseFinderFeed, com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        so2.q2 q2Var = obj instanceof so2.q2 ? (so2.q2) obj : null;
        return (q2Var == null || q2Var.getItemId() <= 0 || q2Var.getItemId() != getItemId()) ? -1 : 0;
    }

    @Override // com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.c
    public long getItemId() {
        return getFeedObject().field_id == 0 ? getFeedObject().getLocalId() : getFeedObject().field_id;
    }

    @Override // com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.c
    public int h() {
        return o2();
    }

    public final long m2() {
        return this.f410549n.getId();
    }

    public final java.lang.String n2() {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = this.f410549n.getObjectDesc();
        r45.mb4 i17 = (objectDesc == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null) ? null : bu2.z.i(finderMedia);
        if (i17 == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17.getString(1));
        java.lang.String string = i17.getString(19);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (string == null) {
            string = "";
        }
        sb6.append(string);
        java.lang.String sb7 = sb6.toString();
        return sb7 == null ? "" : sb7;
    }

    public final int o2() {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        r45.mb4 mb4Var;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = this.f410549n.getObjectDesc();
        if (objectDesc == null || (media = objectDesc.getMedia()) == null || (mb4Var = (r45.mb4) kz5.n0.Z(bu2.z.h(media))) == null) {
            return 0;
        }
        return mb4Var.getInteger(2);
    }

    public final int p2() {
        r45.nw1 liveInfo = this.f410549n.getLiveInfo();
        if (liveInfo != null) {
            return liveInfo.getInteger(31);
        }
        return 0;
    }

    public final boolean q2() {
        return ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).gk(this.f410549n.getLiveInfo());
    }

    public final boolean r2() {
        boolean s27 = s2();
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f410549n;
        if (s27) {
            r45.nw1 liveInfo = finderObject.getLiveInfo();
            if (liveInfo == null || liveInfo.getInteger(31) != 5) {
                return false;
            }
        } else if (finderObject.getPrivateFlag() != 1) {
            return false;
        }
        return true;
    }

    public final boolean s2() {
        return o2() == 9;
    }

    public final boolean t2() {
        ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f410549n;
        return ((vd2.d5) i0Var).bj(finderObject.getUsername(), finderObject.getLiveInfo());
    }

    public /* synthetic */ q2(com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(finderObject, (i18 & 2) != 0 ? 0 : i17);
    }
}
