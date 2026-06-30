package sc2;

/* loaded from: classes2.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc2.i f405794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f405795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f405796c;

    public c(sc2.i iVar, int i17, long j17) {
        this.f405794a = iVar;
        this.f405795b = i17;
        this.f405796c = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String string;
        int i17;
        java.util.ArrayList dataListJustForAdapter;
        java.lang.Object obj2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i18 = fVar.f70615a;
        int i19 = fVar.f70616b;
        com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f405796c);
        sc2.i iVar = this.f405794a;
        iVar.getClass();
        if (i19 == -4061) {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492091f60);
            kotlin.jvm.internal.o.f(string, "getString(...)");
        } else if (i19 == -4060) {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492092f61);
            kotlin.jvm.internal.o.f(string, "getString(...)");
        } else if (i19 != -4057) {
            if (i19 == 0 && (fVar2 instanceof r45.rh2) && ((i17 = this.f405795b) == 3 || i17 == 4)) {
                boolean z17 = i17 == 3;
                long longValue = valueOf != null ? valueOf.longValue() : 0L;
                int e17 = z17 ? c01.id.e() : 0;
                com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(longValue);
                if (h17 != null) {
                    h17.setStickyTime(e17);
                }
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = iVar.f405955a;
                if (baseFinderFeedLoader != null && (dataListJustForAdapter = baseFinderFeedLoader.getDataListJustForAdapter()) != null) {
                    java.util.Iterator it = dataListJustForAdapter.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        so2.j5 j5Var = (so2.j5) obj2;
                        kotlin.jvm.internal.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                        if (((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getItemId() == longValue) {
                            break;
                        }
                    }
                    so2.j5 j5Var2 = (so2.j5) obj2;
                    if (j5Var2 != null) {
                        ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2).getFeedObject().getFinderObject().setStickyTime(e17);
                    }
                }
                com.tencent.mm.autogen.events.FeedStickyEvent feedStickyEvent = new com.tencent.mm.autogen.events.FeedStickyEvent();
                feedStickyEvent.f54251g.f6828a = 1001;
                feedStickyEvent.e();
                android.content.Context context = iVar.f405957c;
                if (context != null) {
                    if (z17) {
                        db5.t7.f(context, context.getString(com.tencent.mm.R.string.f492093f62), sc2.a.f405739a);
                    } else {
                        db5.t7.f(context, context.getString(com.tencent.mm.R.string.cn7), sc2.b.f405772a);
                    }
                }
            }
            string = "";
        } else {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f5z, java.lang.Integer.valueOf(iVar.f405956b));
            kotlin.jvm.internal.o.f(string, "getString(...)");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            db5.t7.f(com.tencent.mm.sdk.platformtools.x2.f193071a, string, sc2.d.f405819a);
        }
        return jz5.f0.f302826a;
    }
}
