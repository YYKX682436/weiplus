package wr3;

/* loaded from: classes11.dex */
public final class m1 extends wr3.f0 {

    /* renamed from: x, reason: collision with root package name */
    public int f448837x;

    /* renamed from: y, reason: collision with root package name */
    public int f448838y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f448839z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(android.content.Context context, java.lang.String bizUsername, boolean z17, int i17, long j17, boolean z18, sr3.g config, com.tencent.mm.storage.z3 contact) {
        super(context, bizUsername, z17, i17, j17, z18, config, contact);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(contact, "contact");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x028a, code lost:
    
        if (r4 != 4) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // wr3.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void L(androidx.recyclerview.widget.k3 r35, int r36) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wr3.m1.L(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // wr3.f0
    public wr3.c0 N(wr3.n0 status, r45.s5 message, int i17) {
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(message, "message");
        return new wr3.l1(status, message, 0);
    }

    @Override // wr3.f0
    public androidx.recyclerview.widget.k3 O(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.e3d, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new yr3.d1(this, inflate, this.f448837x, this.f448838y, this.f448784s.g());
    }

    @Override // wr3.f0
    public int P() {
        return 1;
    }

    @Override // wr3.f0
    public int Q() {
        return 2;
    }

    @Override // wr3.f0
    public int R() {
        return 0;
    }

    @Override // wr3.f0
    public boolean S(r45.s5 bizMessage) {
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(bizMessage, "bizMessage");
        r45.p5 p5Var = bizMessage.f385514i;
        if (!((p5Var == null || (linkedList = p5Var.f382754e) == null || !(linkedList.isEmpty() ^ true)) ? false : true)) {
            r45.y5 y5Var = bizMessage.f385509d;
            if (!(y5Var != null && y5Var.f390791e == 1) || bizMessage.f385510e == null) {
                return false;
            }
        }
        return true;
    }

    @Override // wr3.f0, androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams;
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == 1) {
            android.view.View inflate = from.inflate(com.tencent.mm.R.layout.a19, parent, false);
            android.view.ViewGroup.LayoutParams layoutParams2 = inflate.getLayoutParams();
            layoutParams = layoutParams2 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams ? (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams2 : null;
            if (layoutParams != null) {
                layoutParams.f11941i = true;
            }
            return new wr3.d0(inflate);
        }
        if (i17 != 2) {
            return O(parent, i17);
        }
        android.view.View inflate2 = from.inflate(com.tencent.mm.R.layout.e3k, parent, false);
        android.view.ViewGroup.LayoutParams layoutParams3 = inflate2.getLayoutParams();
        layoutParams = layoutParams3 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams ? (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams3 : null;
        if (layoutParams != null) {
            layoutParams.f11941i = true;
        }
        return new wr3.e0(inflate2);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewAttachedToWindow(androidx.recyclerview.widget.k3 holder) {
        android.content.Context context;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (this.f448784s.g() != sr3.a.f411830f || (context = this.f448778m) == null || !(context instanceof com.tencent.mm.plugin.profile.ui.ContactInfoUI) || this.f448839z) {
            return;
        }
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.profile.ui.ContactInfoUI");
        gr3.c.d((com.tencent.mm.plugin.profile.ui.ContactInfoUI) context);
        this.f448839z = true;
    }
}
