package fl5;

/* loaded from: classes5.dex */
public class j extends ck5.f {

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.ref.WeakReference f263953j;

    public j(java.lang.ref.WeakReference weakReference) {
        super("");
        this.f263953j = weakReference;
    }

    public static fl5.j g(fl5.i iVar) {
        return new fl5.j(new java.lang.ref.WeakReference(iVar));
    }

    @Override // ck5.f
    public int a() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f42559d)) {
            java.lang.ref.WeakReference weakReference = this.f263953j;
            if (weakReference == null) {
                return 1;
            }
            this.f42559d = ((fl5.i) weakReference.get()).getText().toString().trim();
        }
        int e17 = com.tencent.mm.ui.tools.v4.e(this.f42559d, this.f42562g);
        if (e17 < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.InputIEdtBoundaryCheck", "you are crazy =.=!that is 2 GB character!");
            return 2;
        }
        if (e17 < this.f42561f) {
            return 1;
        }
        return e17 > this.f42560e ? 2 : 0;
    }

    @Override // ck5.f
    public void c() {
        if (!this.f42556a) {
            java.lang.ref.WeakReference weakReference = this.f263953j;
            if (weakReference == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.InputIEdtBoundaryCheck", "edit text view is null");
                return;
            } else if (com.tencent.mm.sdk.platformtools.t8.L0(this.f42563h)) {
                ((fl5.i) weakReference.get()).setFilters(new android.text.InputFilter[]{f(this.f42560e, this.f42562g)});
            } else {
                this.f42563h.add(f(this.f42560e, this.f42562g));
                java.util.ArrayList arrayList = this.f42563h;
                ((fl5.i) weakReference.get()).setFilters((android.text.InputFilter[]) arrayList.toArray(new android.text.InputFilter[arrayList.size()]));
            }
        }
        if (this.f42564i != null) {
            int a17 = a();
            if (a17 == 0) {
                this.f42564i.c1(this.f42559d);
            } else if (a17 == 1) {
                this.f42564i.R5(this.f42559d);
            } else {
                if (a17 != 2) {
                    return;
                }
                this.f42564i.w0(this.f42559d);
            }
        }
    }
}
