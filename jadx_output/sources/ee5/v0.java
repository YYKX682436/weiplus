package ee5;

/* loaded from: classes9.dex */
public final class v0 extends ee5.t2 implements zd5.q, zd5.p {

    /* renamed from: r, reason: collision with root package name */
    public zd5.n f252071r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    @Override // zd5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void H3(zd5.k r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee5.v0.H3(zd5.k, int, int):void");
    }

    @Override // ee5.t2
    public android.text.SpannableString O6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f353948a.a(activity).a(ee5.e3.class)).f251870f;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemFileUIC", "getEmptyResultString >> " + str);
        return o13.q.m(getString(com.tencent.mm.R.string.fgw), getString(com.tencent.mm.R.string.fgt), str);
    }

    @Override // ee5.t2
    public zd5.n P6() {
        if (this.f252071r == null) {
            this.f252071r = new zd5.n(getActivity(), this, this);
        }
        zd5.n nVar = this.f252071r;
        kotlin.jvm.internal.o.d(nVar);
        return nVar;
    }

    @Override // ee5.t2
    public int Q6() {
        return 2;
    }

    @Override // zd5.p
    public void W2(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemFileUIC", "[onItemClick] position:%s", java.lang.Integer.valueOf(i17));
        U6();
        de5.a.e(de5.a.f229396a, 2, 0, 0, 6, null);
        if (!R6()) {
            db5.t7.k(getActivity(), null);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(getActivity(), "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
        intent.putExtra("app_msg_id", item.f4400d);
        intent.putExtra("msg_talker", item.f4405i);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiItemFileUIC", "enterFileProfile", "(Lcom/tencent/mm/ui/chatting/search/multi/bean/FTSMultiNormalResultItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiItemFileUIC", "enterFileProfile", "(Lcom/tencent/mm/ui/chatting/search/multi/bean/FTSMultiNormalResultItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // zd5.p
    public void a6(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemFileUIC", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.tools.s6 s6Var = new com.tencent.mm.ui.tools.s6(v17.getContext());
        de5.a.f229396a.c(14, 2);
        s6Var.a(v17, new ee5.r0(this, item, v17), new ee5.s0(item, this), null);
    }

    @Override // zd5.q
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(te5.h.f418649a.c() ? com.tencent.mm.R.layout.efm : com.tencent.mm.R.layout.bct, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new ee5.b(inflate);
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
