package v2;

/* loaded from: classes15.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f432700a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f432701b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f432702c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f432703d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f432704e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f432705f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f432706g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f432707h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f432708i;

    public k(java.util.List list) {
        this.f432701b = false;
        this.f432702c = new int[]{-1, -1};
        this.f432703d = new java.util.ArrayList();
        this.f432704e = new java.util.ArrayList();
        this.f432705f = new java.util.HashSet();
        this.f432706g = new java.util.HashSet();
        this.f432707h = new java.util.ArrayList();
        this.f432708i = new java.util.ArrayList();
        this.f432700a = list;
    }

    public void a(v2.i iVar, int i17) {
        if (i17 == 0) {
            this.f432705f.add(iVar);
        } else if (i17 == 1) {
            this.f432706g.add(iVar);
        }
    }

    public final void b(java.util.ArrayList arrayList, v2.i iVar) {
        if (iVar.f432654c0) {
            return;
        }
        arrayList.add(iVar);
        iVar.f432654c0 = true;
        if (iVar.o()) {
            return;
        }
        if (iVar instanceof v2.m) {
            v2.m mVar = (v2.m) iVar;
            int i17 = mVar.f432715j0;
            for (int i18 = 0; i18 < i17; i18++) {
                b(arrayList, mVar.f432714i0[i18]);
            }
        }
        for (v2.g gVar : iVar.A) {
            v2.g gVar2 = gVar.f432637d;
            if (gVar2 != null) {
                v2.i iVar2 = iVar.D;
                v2.i iVar3 = gVar2.f432635b;
                if (iVar3 != iVar2) {
                    b(arrayList, iVar3);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(v2.i r9) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.k.c(v2.i):void");
    }

    public k(java.util.List list, boolean z17) {
        this.f432701b = false;
        this.f432702c = new int[]{-1, -1};
        this.f432703d = new java.util.ArrayList();
        this.f432704e = new java.util.ArrayList();
        this.f432705f = new java.util.HashSet();
        this.f432706g = new java.util.HashSet();
        this.f432707h = new java.util.ArrayList();
        this.f432708i = new java.util.ArrayList();
        this.f432700a = list;
        this.f432701b = z17;
    }
}
