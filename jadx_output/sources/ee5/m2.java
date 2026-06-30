package ee5;

/* loaded from: classes9.dex */
public final class m2 extends ee5.t2 implements zd5.q, zd5.p {

    /* renamed from: r, reason: collision with root package name */
    public zd5.n f251973r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // zd5.q
    public void H3(zd5.k holder, int i17, int i18) {
        kotlin.jvm.internal.o.g(holder, "holder");
        ae5.m mVar = (ae5.m) getItem(i17);
        if (com.tencent.mm.sdk.platformtools.t8.K0("") || !com.tencent.mm.sdk.platformtools.t8.K0(mVar.f4429k)) {
            ((ee5.r3) holder).f252037n.setVisibility(8);
        } else {
            android.widget.TextView textView = ((ee5.r3) holder).f252037n;
            textView.setVisibility(0);
            textView.setText("");
        }
        ee5.r3 r3Var = (ee5.r3) holder;
        java.lang.String str = mVar.f4429k;
        java.lang.String str2 = str != null ? str : "";
        android.widget.TextView textView2 = r3Var.f252038o;
        textView2.setText(str2);
        zd5.n nVar = this.f251973r;
        holder.i(textView2, nVar != null ? nVar.f471702g : null);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        android.graphics.Bitmap m07 = m11.b1.Di().m0(null, mVar.f4430l, i65.a.g(getActivity()), false);
        android.widget.ImageView imageView = r3Var.f252036m;
        if (m07 != null && !m07.isRecycled()) {
            imageView.setImageBitmap(m07);
            return;
        }
        android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(mVar.f4428j, 1, i65.a.g(getActivity()));
        boolean z17 = mVar.f4431m;
        java.lang.String b17 = qk.c.b(mVar.f4430l, 4, z17);
        if (Di != null && !Di.isRecycled()) {
            imageView.setImageBitmap(Di);
            return;
        }
        int i19 = z17 ? 4 : 0;
        o11.f fVar = new o11.f();
        fVar.f342091o = com.tencent.mm.R.color.f478816i1;
        fVar.f342079c = true;
        fVar.f342082f = tv.a.b(b17);
        int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 50);
        int b19 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 50);
        fVar.f342086j = b18;
        fVar.f342087k = b19;
        fVar.A = new r35.n0(i19);
        fVar.B = new r35.w(i19);
        fVar.f342077a = true;
        n11.a.b().h(b17, imageView, fVar.a());
    }

    @Override // ee5.t2
    public android.text.SpannableString O6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f353948a.a(activity).a(ee5.e3.class)).f251870f;
        com.tencent.mars.xlog.Log.i("MicroMsg. FTSMultiItemUrlUIC", "getEmptyResultString >> " + str);
        return o13.q.m(getString(com.tencent.mm.R.string.fgw), getString(com.tencent.mm.R.string.fgx), str);
    }

    @Override // ee5.t2
    public zd5.n P6() {
        if (this.f251973r == null) {
            this.f251973r = new zd5.n(getActivity(), this, this);
        }
        zd5.n nVar = this.f251973r;
        kotlin.jvm.internal.o.d(nVar);
        return nVar;
    }

    @Override // ee5.t2
    public int Q6() {
        return 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0405, code lost:
    
        if (r8 != false) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0809 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // zd5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W2(android.view.View r29, int r30, ae5.g r31) {
        /*
            Method dump skipped, instructions count: 2454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee5.m2.W2(android.view.View, int, ae5.g):void");
    }

    public boolean W6(int i17) {
        return i17 == 5 || i17 == 7 || i17 == 27 || i17 == 26 || i17 == 97 || i17 == 15 || i17 == 4 || i17 == 68 || i17 == 119 || i17 == 120;
    }

    @Override // zd5.p
    public void a6(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg. FTSMultiItemUrlUIC", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.tools.s6 s6Var = new com.tencent.mm.ui.tools.s6(v17.getContext());
        de5.a.f229396a.c(14, 3);
        s6Var.a(v17, new ee5.i2(this, v17), new ee5.j2(item, this), null);
    }

    @Override // zd5.q
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bct, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new ee5.r3(inflate);
    }

    @Override // zd5.q
    public int getCount() {
        return this.f252054m.size();
    }

    @Override // zd5.q
    public ae5.g getItem(int i17) {
        java.lang.Object obj = this.f252054m.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return (ae5.g) obj;
    }
}
