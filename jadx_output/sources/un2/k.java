package un2;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public so2.u1 f429471a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f429472b;

    /* renamed from: c, reason: collision with root package name */
    public un2.a f429473c;

    /* renamed from: d, reason: collision with root package name */
    public long f429474d;

    /* renamed from: e, reason: collision with root package name */
    public long f429475e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f429476f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f429477g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f429478h;

    /* renamed from: j, reason: collision with root package name */
    public java.util.LinkedList f429480j;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f429479i = new byte[1024];

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f429481k = jz5.h.b(un2.c.f429457d);

    public static final void a(un2.k kVar, int i17, int i18) {
        if (i17 >= i18) {
            kVar.getClass();
            return;
        }
        kVar.b(i18, "dyeArray");
        byte[] bArr = kVar.f429479i;
        int length = i18 >= bArr.length ? bArr.length - 1 : i18;
        com.tencent.mars.xlog.Log.i("FinderBulletLoader", "dyeArray: startIndex=" + i17 + ", realEndIndex=" + length + ", endIndex=" + i18 + ", arraySize=" + kVar.f429479i.length);
        if (i17 > length) {
            return;
        }
        while (true) {
            kVar.f429479i[i17] = 1;
            if (i17 == length) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final void b(int i17, java.lang.String str) {
        if (i17 + 1 <= this.f429479i.length) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkExpandArray: source=");
        sb6.append(str);
        sb6.append(", totalTime=");
        sb6.append(i17);
        sb6.append(", current array size = ");
        sb6.append(this.f429479i.length);
        sb6.append(", maxVideoDuration=");
        jz5.g gVar = this.f429481k;
        sb6.append(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
        com.tencent.mars.xlog.Log.i("FinderBulletLoader", sb6.toString());
        if (i17 >= ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue()) {
            i17 = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() - 1;
        }
        int length = this.f429479i.length;
        do {
            length += 1024;
        } while (length < i17 + 1);
        com.tencent.mars.xlog.Log.i("FinderBulletLoader", "checkExpandArray: source=" + str + ", totalTimeSec=" + i17 + ", newArrayLen = " + length);
        byte[] bArr = new byte[length];
        byte[] bArr2 = this.f429479i;
        java.lang.System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.f429479i = bArr;
    }

    public final so2.u1 c() {
        so2.u1 u1Var = this.f429471a;
        if (u1Var != null) {
            return u1Var;
        }
        kotlin.jvm.internal.o.o("feed");
        throw null;
    }

    public final void d() {
        r45.qt2 qt2Var;
        java.lang.String ak6;
        r45.gl2 gl2Var;
        if (this.f429478h != null && c().f2()) {
            this.f429477g = true;
            long id6 = c().getFeedObject().getId();
            r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(c().getFeedObject().getMediaList());
            int integer = mb4Var != null ? mb4Var.getInteger(3) : 0;
            int P6 = ((ey2.v2) pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class)).P6(id6) + 1;
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            cq.k kVar = (cq.k) c17;
            android.content.Context context = this.f429478h;
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject = c().getFeedObject();
            android.content.Context context2 = this.f429478h;
            if (context2 != null) {
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                qt2Var = nyVar != null ? nyVar.V6() : null;
            } else {
                qt2Var = null;
            }
            java.util.LinkedList linkedList = this.f429480j;
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ak6 = ((com.tencent.mm.plugin.finder.report.o3) c18).ak(0.0f, integer, P6, (r31 & 8) != 0 ? "" : null, (r31 & 16) != 0 ? "" : null, (r31 & 32) != 0 ? 0 : 0, (r31 & 64) != 0 ? "" : null, (r31 & 128) != 0 ? 0 : 0, (r31 & 256) != 0 ? 0 : 0, (r31 & 512) != 0 ? 0L : 0L, (r31 & 1024) != 0 ? 0 : 0);
            r45.dm2 object_extend = c().getFeedObject().getFeedObject().getObject_extend();
            cq.j1.g(kVar, context, feedObject, 0L, null, qt2Var, 0, linkedList, ak6, (object_extend == null || (gl2Var = (r45.gl2) object_extend.getCustom(56)) == null) ? null : gl2Var.getByteString(1), new un2.g(this, id6, 0), new un2.h(this), 12, null);
        }
    }
}
