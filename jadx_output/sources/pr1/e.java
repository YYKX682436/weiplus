package pr1;

/* loaded from: classes9.dex */
public class e implements fb5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView f357937a;

    public e(com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView) {
        this.f357937a = brandServiceSortView;
    }

    @Override // fb5.l
    public android.view.View a(fb5.n nVar, android.view.View view, android.view.ViewGroup viewGroup, int i17, int i18, boolean z17, boolean z18) {
        pr1.k kVar;
        android.view.View view2;
        java.lang.String string;
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView = this.f357937a;
        android.content.Context context = brandServiceSortView.getContext();
        if (view == null) {
            view2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488248o2, (android.view.ViewGroup) null);
            kVar = new pr1.k();
            kVar.f357943c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.bdd);
            kVar.f357942b = view2.findViewById(com.tencent.mm.R.id.cgr);
            kVar.f357945e = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.f483083w4);
            kVar.f357944d = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.k9j);
            kVar.f357946f = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.awx);
            kVar.f357947g = view2.findViewById(com.tencent.mm.R.id.mkr);
            kVar.f357948h = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.t3k);
            view2.setTag(kVar);
        } else {
            kVar = (pr1.k) view.getTag();
            view2 = view;
        }
        r45.co coVar = (r45.co) nVar.f260898b;
        if (coVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandServiceSortView", "should not be empty");
            return view2;
        }
        pr1.i iVar = brandServiceSortView.F;
        if (iVar != null) {
            iVar.X5(i17, coVar.f371676d);
        }
        if (brandServiceSortView.f197872p && z17) {
            kVar.f357943c.setText(nVar.f260897a);
            kVar.f357943c.setVisibility(0);
        } else {
            kVar.f357943c.setVisibility(8);
        }
        if (brandServiceSortView.f94054y) {
            kVar.f357948h.setVisibility(0);
            pr1.h hVar = brandServiceSortView.G;
            if (hVar != null) {
                android.widget.TextView textView = kVar.f357948h;
                java.lang.String username = coVar.f371676d;
                tw.i iVar2 = (tw.i) hVar;
                iVar2.getClass();
                kotlin.jvm.internal.o.g(username, "username");
                if (android.text.TextUtils.isEmpty(username)) {
                    string = "";
                } else {
                    e31.k U6 = iVar2.U6();
                    boolean n17 = U6 != null ? ((g31.l) U6).n(username) : false;
                    if (n17) {
                        e31.k U62 = iVar2.U6();
                        int l17 = U62 != null ? ((g31.l) U62).l(username) : 0;
                        if (l17 > 0) {
                            string = iVar2.getContext().getString(com.tencent.mm.R.string.o6c, java.lang.Integer.valueOf(l17));
                            kotlin.jvm.internal.o.f(string, "getString(...)");
                        }
                    }
                    string = iVar2.getContext().getString(n17 ? com.tencent.mm.R.string.o5p : com.tencent.mm.R.string.f492119o34);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                }
                textView.setText(string);
            }
        } else {
            kVar.f357948h.setVisibility(8);
        }
        java.lang.String str = coVar.f371676d;
        kVar.f357941a = str;
        kVar.f357945e.setTag(str);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(kVar.f357945e, kVar.f357941a);
        java.lang.String g27 = coVar.f371677e.g2();
        android.widget.TextView textView2 = kVar.f357946f;
        int textSize = (int) textView2.getTextSize();
        brandServiceSortView.getClass();
        if (textView2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BrandServiceSortView", "display area is null");
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(g27)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BrandServiceSortView", "remark is null");
        } else {
            java.util.HashMap hashMap = brandServiceSortView.f94048s;
            android.text.SpannableString spannableString = (android.text.SpannableString) hashMap.get(g27);
            if (spannableString == null) {
                try {
                    android.text.SpannableString spannableString2 = new android.text.SpannableString(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, g27, textSize));
                    hashMap.put(g27, spannableString2);
                    textView2.setText(spannableString2);
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BrandServiceSortView", "error, set empty str");
                    textView2.setText("");
                }
            } else {
                textView2.setText(spannableString);
            }
        }
        int i19 = coVar.f371678f.field_status;
        android.widget.ImageView imageView = kVar.f357944d;
        brandServiceSortView.getClass();
        imageView.setVisibility(8);
        if (brandServiceSortView.getMode() == 0 && z18) {
            kVar.f357947g.setBackgroundResource(com.tencent.mm.R.drawable.f481310q6);
        } else {
            kVar.f357947g.setBackgroundResource(com.tencent.mm.R.drawable.bfj);
        }
        if (brandServiceSortView.f197873q) {
            android.view.View view3 = kVar.f357942b;
            view3.setPadding(view3.getPaddingLeft(), kVar.f357942b.getPaddingTop(), (int) brandServiceSortView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479561d), kVar.f357942b.getPaddingBottom());
        } else {
            android.view.View view4 = kVar.f357942b;
            view4.setPadding(view4.getPaddingLeft(), kVar.f357942b.getPaddingTop(), (int) brandServiceSortView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.i_), kVar.f357942b.getPaddingBottom());
        }
        android.os.SystemClock.elapsedRealtime();
        pr1.i iVar3 = brandServiceSortView.F;
        if (iVar3 != null) {
            iVar3.S4(i17, coVar.f371676d);
        }
        return view2;
    }
}
