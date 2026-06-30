package fn4;

/* loaded from: classes15.dex */
public class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn4.g f264561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f264562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xn6 f264563f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fn4.b f264564g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f264565h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fn4.m f264566i;

    public k(fn4.m mVar, fn4.g gVar, android.content.Context context, r45.xn6 xn6Var, fn4.b bVar, int i17) {
        this.f264566i = mVar;
        this.f264561d = gVar;
        this.f264562e = context;
        this.f264563f = xn6Var;
        this.f264564g = bVar;
        this.f264565h = i17;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.x56 x56Var;
        byte[] bArr;
        r45.x56 x56Var2;
        fn4.m mVar = this.f264566i;
        boolean z17 = mVar.f264586g;
        fn4.b bVar = mVar.f264583d;
        if (z17) {
            bVar.I2().k();
            mVar.f264586g = false;
        }
        bVar.B2();
        int itemId = menuItem.getItemId();
        fn4.b1 b1Var = fn4.b1.f264481b;
        r45.xn6 xn6Var = this.f264563f;
        android.content.Context context = this.f264562e;
        fn4.g gVar = this.f264561d;
        fn4.b bVar2 = this.f264564g;
        if (itemId == 1) {
            gVar.l();
            r45.un6 r07 = bVar2.r0();
            if (xn6Var != null && r07 != null) {
                b1Var.f264482a = xn6Var;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Ksnsupload_title", xn6Var.f390263o);
                intent.putExtra("Ksnsupload_imgurl", xn6Var.f390266q);
                intent.putExtra("Ksnsupload_link", xn6Var.f390262n);
                intent.putExtra("KContentObjDesc", com.tencent.mm.sdk.platformtools.t8.K0(xn6Var.f390264p) ? context.getString(com.tencent.mm.R.string.hsm) : xn6Var.f390264p);
                intent.putExtra("KlinkThumb_url", xn6Var.f390266q);
                intent.putExtra("Ksnsupload_source", 1);
                intent.putExtra("Ksnsupload_type", 16);
                intent.putExtra("need_result", true);
                r45.y97 y97Var = new r45.y97();
                y97Var.f390898d = xn6Var.f390259h;
                y97Var.f390899e = xn6Var.f390273x;
                y97Var.f390900f = r07.f387507m;
                y97Var.f390901g = xn6Var.f390272w;
                y97Var.f390902h = 100201L;
                y97Var.f390904m = xn6Var.f390262n;
                y97Var.f390905n = xn6Var.f390263o;
                y97Var.f390906o = xn6Var.f390264p;
                y97Var.f390907p = xn6Var.f390266q;
                y97Var.f390908q = xn6Var.f390267r;
                y97Var.f390909r = xn6Var.f390268s;
                y97Var.f390910s = xn6Var.f390269t;
                y97Var.f390911t = xn6Var.f390270u;
                y97Var.f390903i = xn6Var.f390274y;
                y97Var.f390912u = xn6Var.f390275z;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.addAll(r07.f387511q);
                linkedList.addAll(xn6Var.W);
                y97Var.f390913v = b1Var.c(linkedList).toString();
                y97Var.f390914w = pm4.w.s(xn6Var.D).toString();
                long j17 = xn6Var.M;
                y97Var.f390915x = j17;
                y97Var.f390916y = xn6Var.f390257f;
                if (((j17 == 100201 || j17 == 100203) ? false : true) && (x56Var2 = r07.f387510p) != null) {
                    y97Var.f390917z = x56Var2.f389800i;
                }
                try {
                    bArr = y97Var.toByteArray();
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryVideoShareMgr", e17, "", new java.lang.Object[0]);
                    bArr = null;
                }
                if (bArr != null) {
                    intent.putExtra("KWebSearchInfo", bArr);
                }
                j45.l.n(context, "sns", ".ui.SnsUploadUI", intent, 1024);
            }
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).Ai().a(bVar2.r0(), this.f264563f, this.f264565h, 7, "");
            return;
        }
        if (menuItem.getItemId() == 0) {
            gVar.l();
            r45.un6 r08 = bVar2.r0();
            b1Var.f264482a = xn6Var;
            ot0.q qVar = new ot0.q();
            qVar.f348666i = 5;
            qVar.f348654f = xn6Var.f390263o;
            qVar.f348658g = com.tencent.mm.sdk.platformtools.t8.K0(xn6Var.f390264p) ? context.getString(com.tencent.mm.R.string.hsm) : xn6Var.f390264p;
            java.lang.String str = xn6Var.f390262n;
            qVar.f348674k = str;
            java.lang.String str2 = xn6Var.f390266q;
            qVar.f348734z = str2;
            su4.l2 l2Var = new su4.l2();
            l2Var.f412983b = xn6Var.f390259h;
            l2Var.f412984c = xn6Var.f390273x;
            l2Var.f412985d = r08.f387507m;
            l2Var.f412986e = xn6Var.f390272w;
            l2Var.f412987f = 100201L;
            l2Var.f412988g = str;
            l2Var.f412989h = xn6Var.f390263o;
            l2Var.f412990i = xn6Var.f390264p;
            l2Var.f412991j = str2;
            l2Var.f412992k = xn6Var.f390267r;
            l2Var.f412993l = xn6Var.f390268s;
            l2Var.f412994m = xn6Var.f390269t;
            l2Var.f412995n = xn6Var.f390270u;
            l2Var.f412996o = xn6Var.f390274y;
            l2Var.f412997p = xn6Var.f390275z;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.addAll(r08.f387511q);
            linkedList2.addAll(xn6Var.W);
            l2Var.f412998q = b1Var.c(linkedList2).toString();
            l2Var.f412999r = pm4.w.s(xn6Var.D).toString();
            long j18 = xn6Var.M;
            l2Var.f413000s = j18;
            l2Var.f413001t = xn6Var.f390257f;
            if (((j18 == 100201 || j18 == 100203) ? false : true) && (x56Var = r08.f387510p) != null) {
                l2Var.f413002u = x56Var.f389800i;
            }
            qVar.f(l2Var);
            java.lang.String u17 = ot0.q.u(qVar, null, null);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Retr_Msg_Type", 2);
            intent2.putExtra("Retr_Msg_content", u17);
            intent2.putExtra("Multi_Retr", true);
            intent2.putExtra("Retr_go_to_chattingUI", false);
            intent2.putExtra("Retr_show_success_tips", true);
            j45.l.v(context, ".ui.transmit.MsgRetransmitUI", intent2, 2048);
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).Ai().a(bVar2.r0(), this.f264563f, this.f264565h, 6, "");
        }
    }
}
