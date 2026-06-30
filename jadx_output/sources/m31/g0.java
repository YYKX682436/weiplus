package m31;

/* loaded from: classes9.dex */
public final class g0 extends m31.f {

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f323144m;

    /* renamed from: n, reason: collision with root package name */
    public final m31.d f323145n;

    public g0(android.content.Context context, m31.d listener) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f323144m = context;
        this.f323145n = listener;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f323134d.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getItemViewType(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L11
            java.util.ArrayList r0 = r2.f323134d
            int r1 = r0.size()
            if (r3 >= r1) goto L11
            java.lang.Object r3 = r0.get(r3)
            m31.a r3 = (m31.a) r3
            goto L12
        L11:
            r3 = 0
        L12:
            if (r3 == 0) goto L19
            int r3 = r3.h()
            goto L1b
        L19:
            int r3 = r2.f323136f
        L1b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m31.g0.getItemViewType(int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r13, int r14) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m31.g0.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        int i18 = this.f323135e;
        android.content.Context context = this.f323144m;
        if (i17 == i18) {
            android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.cxa, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new m31.d0(inflate);
        }
        if (i17 == this.f323136f) {
            android.view.View inflate2 = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.epr, parent, false);
            kotlin.jvm.internal.o.d(inflate2);
            return new m31.e0(inflate2);
        }
        android.view.View inflate3 = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.epr, parent, false);
        kotlin.jvm.internal.o.d(inflate3);
        return new m31.e0(inflate3);
    }
}
