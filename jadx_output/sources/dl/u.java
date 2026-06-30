package dl;

/* loaded from: classes10.dex */
public class u extends dl.b {

    /* renamed from: q, reason: collision with root package name */
    public float f235133q;

    /* renamed from: r, reason: collision with root package name */
    public float f235134r;

    /* renamed from: s, reason: collision with root package name */
    public float f235135s;

    /* renamed from: t, reason: collision with root package name */
    public float f235136t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f235137u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f235138v = false;

    /* renamed from: w, reason: collision with root package name */
    public int f235139w = dn5.c.D[2];

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Path f235140x = new android.graphics.Path();

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f235141y = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final hk0.y f235142z = new hk0.y();
    public boolean A = false;

    @Override // dl.b
    public void A(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DoodleArtist", "forwardUndo >> editId: %s", str);
        hk0.u0 l17 = l();
        if (l17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DoodleArtist", "forwardUndo but model is null");
            return;
        }
        hk0.c c17 = l17.f281818i.c(str);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DoodleArtist", "forwardUndo editData is null");
            return;
        }
        hk0.h hVar = hk0.h.f281741f;
        xk0.d dVar = c17.f281706d;
        if (c17.f281705c != hVar) {
            d().add(dVar);
            E(false);
            return;
        }
        java.util.ArrayList arrayList = c17.f281707e;
        if (arrayList != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DoodleArtist", "onForwardUndo eraser list");
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((um.e) d()).a((xk0.d) it.next());
            }
        } else if (dVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DoodleArtist", "onForwardUndo eraser single");
            ((um.e) d()).a(dVar);
        }
        E(true);
    }

    @Override // dl.b
    public void C() {
        E(true);
    }

    @Override // dl.b
    public dl.a m() {
        return dl.a.DOODLE;
    }

    @Override // dl.b
    public void t() {
        super.t();
        com.tencent.mars.xlog.Log.i("MicroMsg.DoodleArtist", "DoodleArtist >> onAlive");
        ((l45.n) this.f235039a).k();
        dl.u$$a u__a = new dl.u$$a(this);
        hk0.y yVar = this.f235142z;
        yVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditEraserHelper", "setDoodleSelectCallback");
        yVar.f281844d = u__a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r3 != 5) goto L83;
     */
    @Override // dl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean x(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.u.x(android.view.MotionEvent):boolean");
    }

    @Override // dl.b
    public void y(android.graphics.Canvas canvas) {
        canvas.save();
        canvas.clipRect(this.f235041c);
        v(canvas);
        android.graphics.Path path = this.f235140x;
        if (!path.isEmpty()) {
            new xk0.d(path, ((l45.n) this.f235039a).k() / ((l45.n) this.f235039a).g(), this.f235139w).a(canvas);
        }
        canvas.restore();
    }
}
