package yh5;

/* loaded from: classes12.dex */
public final class p extends pf3.g implements rf3.h {

    /* renamed from: v, reason: collision with root package name */
    public fq.a f462441v;

    /* renamed from: w, reason: collision with root package name */
    public android.os.Bundle f462442w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(mf3.p apiCenter) {
        super(apiCenter, "CleanGallery.SourceLayer");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
    }

    @Override // rf3.h
    public void D() {
        e0();
        Y(this, new yh5.o(this));
        a0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        super.F();
        a0();
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e2v, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.u7v);
        if (textView == null) {
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(com.tencent.mm.R.id.u7v)));
        }
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
        this.f462441v = new fq.a(relativeLayout, textView);
        kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
        return relativeLayout;
    }

    @Override // rf3.h
    public void b() {
        Y(this, yh5.m.f462438d);
        b0();
    }

    @Override // rf3.h
    public void h() {
        e0();
        Y(this, new yh5.n(this));
        a0();
    }

    @Override // mf3.l
    public void onResume() {
        e0();
        a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // pf3.g, mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        boolean z17;
        java.lang.CharSequence charSequence;
        long longValue;
        java.lang.String str;
        kotlin.jvm.internal.o.g(bindContext, "bindContext");
        super.t(bindContext);
        android.content.Context K = K();
        pf5.z zVar = pf5.z.f353948a;
        if (!(K instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) K).a(yh5.g.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        java.util.List list = ((yh5.g) a17).f462432d;
        int i17 = bindContext.f326118b;
        bw1.l lVar = (bw1.l) kz5.n0.a0(list, i17);
        if (lVar == null) {
            com.tencent.mars.xlog.Log.i("CleanSourceLayer", "bind position=" + i17 + " media=null");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.List list2 = lVar.f24824p;
        if (list2 == null || list2.isEmpty()) {
            java.lang.String[] strArr = new java.lang.String[1];
            java.lang.String str2 = lVar.f24813e;
            java.lang.String str3 = str2 != null ? str2 : "";
            z17 = false;
            strArr[0] = str3;
            bundle.putStringArray("u", strArr);
            bundle.putLongArray("m", new long[]{lVar.f24814f});
        } else {
            java.util.ArrayList arrayList = (java.util.ArrayList) list2;
            int size = arrayList.size() + 1;
            java.lang.String[] strArr2 = new java.lang.String[size];
            for (int i18 = 0; i18 < size; i18++) {
                if (i18 == 0) {
                    str = lVar.f24813e;
                    if (str != null) {
                        strArr2[i18] = str;
                    }
                    str = "";
                    strArr2[i18] = str;
                } else {
                    str = (java.lang.String) ((android.util.Pair) arrayList.get(i18 - 1)).first;
                    if (str != null) {
                        strArr2[i18] = str;
                    }
                    str = "";
                    strArr2[i18] = str;
                }
            }
            int size2 = arrayList.size() + 1;
            long[] jArr = new long[size2];
            for (int i19 = 0; i19 < size2; i19++) {
                if (i19 == 0) {
                    longValue = lVar.f24814f;
                } else {
                    java.lang.Object second = ((android.util.Pair) arrayList.get(i19 - 1)).second;
                    kotlin.jvm.internal.o.f(second, "second");
                    longValue = ((java.lang.Number) second).longValue();
                }
                jArr[i19] = longValue;
            }
            bundle.putStringArray("u", strArr2);
            bundle.putLongArray("m", jArr);
            z17 = false;
        }
        bundle.putInt("t", lVar.f24810b);
        this.f462442w = bundle;
        boolean z18 = bundle.containsKey("u") ? true : z17 ? true : z17;
        com.tencent.mars.xlog.Log.i("CleanSourceLayer", "bind position=" + i17 + " hasJumpChat=" + z18);
        fq.a aVar = this.f462441v;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        aVar.f265389b.setVisibility(z18 ? z17 : 8);
        if (z18) {
            c01.f8 f8Var = (c01.f8) i95.n0.c(c01.f8.class);
            if (f8Var != null) {
                android.content.Context K2 = K();
                android.os.Bundle bundle2 = this.f462442w;
                kotlin.jvm.internal.o.d(bundle2);
                fq.a aVar2 = this.f462441v;
                if (aVar2 == null) {
                    kotlin.jvm.internal.o.o("rootVB");
                    throw null;
                }
                charSequence = ((yv1.b1) f8Var).Ri(K2, bundle2, aVar2.f265389b.getTextSize());
            } else {
                charSequence = null;
            }
            if (charSequence != null) {
                fq.a aVar3 = this.f462441v;
                if (aVar3 == null) {
                    kotlin.jvm.internal.o.o("rootVB");
                    throw null;
                }
                aVar3.f265389b.setText(charSequence);
            }
        }
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        super.u(parentView);
        fq.a aVar = this.f462441v;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.TextView jumpChatBtn = aVar.f265389b;
        kotlin.jvm.internal.o.f(jumpChatBtn, "jumpChatBtn");
        pf3.d.W(this, jumpChatBtn, null, 1, null);
        pf3.d.U(this, jumpChatBtn, null, new yh5.l(this), 1, null);
    }
}
