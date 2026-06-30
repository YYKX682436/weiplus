package zd5;

/* loaded from: classes9.dex */
public final class g extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f471681d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.a3 f471682e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f471683f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.q f471684g;

    /* renamed from: h, reason: collision with root package name */
    public p13.r f471685h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f471686i;

    public g(android.app.Activity context, com.tencent.mm.storage.a3 a3Var) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f471681d = context;
        this.f471682e = a3Var;
        this.f471683f = new java.util.ArrayList();
        this.f471686i = kotlinx.coroutines.z0.b();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiAllResultAdapter", "getItemCount >> " + this.f471683f.size());
        return this.f471683f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((ae5.j) this.f471683f.get(i17)).f4411a.f471655d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x009e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x00a3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x066f  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r29, int r30) {
        /*
            Method dump skipped, instructions count: 2010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zd5.g.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        zd5.a aVar = zd5.a.f471651e;
        boolean z17 = true;
        if (i17 != 2) {
            zd5.a aVar2 = zd5.a.f471651e;
            if (i17 != 3) {
                z17 = false;
            }
        }
        if (z17) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bci, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new zd5.r(inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bcj, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        return new zd5.s(inflate2);
    }
}
