package pk2;

/* loaded from: classes3.dex */
public final class l7 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public db5.g4 f355958d;

    /* renamed from: e, reason: collision with root package name */
    public db5.t4 f355959e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f355960f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk2.p7 f355961g;

    public l7(pk2.p7 p7Var) {
        this.f355961g = p7Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        db5.g4 g4Var = this.f355958d;
        if (g4Var != null) {
            return g4Var.size();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r22, int r23) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.l7.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f355961g.f356160a).inflate(com.tencent.mm.R.layout.eef, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new pk2.m7(inflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003d  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewAttachedToWindow(androidx.recyclerview.widget.k3 r8) {
        /*
            r7 = this;
            pk2.m7 r8 = (pk2.m7) r8
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.g(r8, r0)
            super.onViewAttachedToWindow(r8)
            int r0 = r8.getAdapterPosition()
            r1 = -1
            if (r0 != r1) goto L13
            goto Lbc
        L13:
            db5.g4 r1 = r7.f355958d
            r2 = 0
            if (r1 == 0) goto L35
            java.util.List r1 = r1.f228344d
            if (r1 == 0) goto L35
            r3 = r1
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            if (r0 >= r3) goto L27
            r3 = 1
            goto L28
        L27:
            r3 = 0
        L28:
            if (r3 == 0) goto L2b
            goto L2c
        L2b:
            r1 = r2
        L2c:
            if (r1 == 0) goto L35
            java.lang.Object r1 = r1.get(r0)
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            goto L36
        L35:
            r1 = r2
        L36:
            boolean r3 = r1 instanceof db5.h4
            if (r3 == 0) goto L3d
            db5.h4 r1 = (db5.h4) r1
            goto L3e
        L3d:
            r1 = r2
        L3e:
            if (r1 != 0) goto L42
            goto Lbc
        L42:
            boolean r3 = r1.f228375s
            r4 = 1065353216(0x3f800000, float:1.0)
            android.widget.ImageView r5 = r8.f356009f
            if (r3 != 0) goto L9c
            java.lang.Integer r3 = r7.f355960f
            if (r3 == 0) goto L9c
            int r3 = r3.intValue()
            int r6 = r1.f228366g
            if (r6 != r3) goto L9c
            r8.i()
            if (r5 == 0) goto Lbc
            r1 = 0
            r5.setAlpha(r1)
            android.graphics.drawable.Drawable r1 = r5.getBackground()
            if (r1 == 0) goto L69
            android.graphics.drawable.Drawable r2 = r1.mutate()
        L69:
            if (r2 != 0) goto L6c
            goto L79
        L6c:
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r3 = 1292353888(0x4d07c160, float:1.4234982E8)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_OVER
            r1.<init>(r3, r6)
            r2.setColorFilter(r1)
        L79:
            android.view.ViewPropertyAnimator r1 = r5.animate()
            android.view.ViewPropertyAnimator r1 = r1.alpha(r4)
            r2 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r2)
            pk2.k7 r2 = new pk2.k7
            r2.<init>(r7, r8, r5, r0)
            android.view.ViewPropertyAnimator r0 = r1.withEndAction(r2)
            java.lang.String r1 = "withEndAction(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            r8.f356012i = r0
            r0.start()
            goto Lbc
        L9c:
            r8.i()
            if (r5 == 0) goto Lb0
            android.graphics.drawable.Drawable r8 = r5.getBackground()
            if (r8 == 0) goto Lb0
            android.graphics.drawable.Drawable r8 = r8.mutate()
            if (r8 == 0) goto Lb0
            r8.clearColorFilter()
        Lb0:
            if (r5 != 0) goto Lb3
            goto Lbc
        Lb3:
            boolean r8 = r1.f228375s
            if (r8 == 0) goto Lb9
            r4 = 1056964608(0x3f000000, float:0.5)
        Lb9:
            r5.setAlpha(r4)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.l7.onViewAttachedToWindow(androidx.recyclerview.widget.k3):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewDetachedFromWindow(androidx.recyclerview.widget.k3 k3Var) {
        pk2.m7 holder = (pk2.m7) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        holder.i();
    }
}
