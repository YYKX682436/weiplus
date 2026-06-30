package he5;

/* loaded from: classes9.dex */
public class m implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public android.database.Cursor f280949a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f280950b;

    /* renamed from: c, reason: collision with root package name */
    public final int f280951c;

    /* renamed from: d, reason: collision with root package name */
    public final int f280952d;

    /* renamed from: e, reason: collision with root package name */
    public final hd5.n f280953e;

    /* renamed from: f, reason: collision with root package name */
    public final he5.l f280954f;

    /* renamed from: g, reason: collision with root package name */
    public long f280955g;

    public m(java.lang.String str, int i17, int i18, hd5.n nVar, he5.l lVar) {
        this.f280950b = str;
        this.f280951c = i17;
        this.f280952d = i18;
        this.f280953e = nVar;
        this.f280954f = lVar;
    }

    @Override // he5.t
    public int a() {
        return this.f280952d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [he5.m] */
    @Override // he5.t
    public void b(java.util.List list, he5.s sVar) {
        ?? arrayList = new java.util.ArrayList();
        e(arrayList);
        hd5.n nVar = hd5.n.ACTION_POSITION;
        he5.l lVar = this.f280954f;
        int i17 = this.f280951c;
        boolean z17 = false;
        hd5.n nVar2 = this.f280953e;
        if (nVar2 != nVar && nVar2 != hd5.n.ACTION_UPDATE) {
            if (i17 < 2 || arrayList.size() < i17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ChattingLoader.ChattingServiceNotifyDataSource", "check if need load more data, but list is null or less than expect, except count: %d, actual count: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(arrayList.size()));
            } else {
                z17 = ((ke5.v) lVar).a((com.tencent.mm.storage.f9) arrayList.get(0), (com.tencent.mm.storage.f9) arrayList.get(1));
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingServiceNotifyDataSource", "need load more data: %b", java.lang.Boolean.valueOf(z17));
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingServiceNotifyDataSource", "contain flex data, load more");
            arrayList.clear();
            close();
            com.tencent.mm.storage.x4 x4Var = (com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni();
            java.lang.String str = this.f280950b;
            this.f280949a = ((com.tencent.mm.storage.g9) c01.d9.b().u()).M4(str, java.lang.Math.min(i17 + 8, this.f280952d), x4Var.m0(str));
            e(arrayList);
            int i18 = 7;
            while (i18 > 0) {
                int i19 = i18 - 1;
                if (!((ke5.v) lVar).a((com.tencent.mm.storage.f9) arrayList.get(i18), (com.tencent.mm.storage.f9) arrayList.get(i19))) {
                    break;
                } else {
                    i18 = i19;
                }
            }
            arrayList = arrayList.subList(i18, arrayList.size());
        }
        list.addAll(arrayList);
        ((hd5.f) sVar).a();
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        com.tencent.mm.storage.x4 x4Var = (com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni();
        java.lang.String str = this.f280950b;
        this.f280955g = x4Var.m0(str);
        xg3.m0 u17 = c01.d9.b().u();
        this.f280949a = ((com.tencent.mm.storage.g9) u17).M4(str, this.f280951c, this.f280955g);
        oVar.next();
    }

    @Override // he5.t
    public void close() {
        this.f280949a.close();
    }

    @Override // he5.t
    public long d() {
        return this.f280955g;
    }

    public final void e(java.util.List list) {
        try {
            this.f280949a.moveToFirst();
            while (!this.f280949a.isAfterLast()) {
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                f9Var.convertFrom(this.f280949a);
                list.add(f9Var);
                this.f280949a.moveToNext();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingLoader.ChattingServiceNotifyDataSource", e17, "", new java.lang.Object[0]);
        }
    }
}
