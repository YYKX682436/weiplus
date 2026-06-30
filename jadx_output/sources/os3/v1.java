package os3;

/* loaded from: classes8.dex */
public class v1 implements com.tencent.mm.modelbase.u0, com.tencent.mars.cdn.CdnManager.UploadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.qqmail.ui.ComposeUI f348222d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f348223e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f348224f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f348225g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f348226h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f348227i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f348228m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public os3.u1 f348229n = null;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnClickListener f348230o;

    public v1(com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI, android.widget.TextView textView, android.widget.ImageView imageView, android.view.ViewGroup viewGroup) {
        this.f348230o = null;
        this.f348222d = composeUI;
        this.f348223e = viewGroup;
        this.f348230o = null;
        this.f348224f = textView;
        this.f348225g = imageView;
        b();
        gm0.j1.n().f273288b.a(11665, this);
    }

    public void a() {
        java.util.Map map = this.f348226h;
        java.util.Iterator it = ((java.util.HashMap) map).keySet().iterator();
        while (it.hasNext()) {
            ks3.v0 v0Var = (ks3.v0) ((java.util.HashMap) map).get((java.lang.String) it.next());
            if (v0Var.f311758g != 2) {
                java.util.Map map2 = this.f348227i;
                ms3.a aVar = (ms3.a) ((java.util.HashMap) map2).get(v0Var.f311755d);
                if (aVar != null) {
                    gm0.j1.n().f273288b.d(aVar);
                    v0Var.f311758g = 3;
                    g(v0Var);
                    ((java.util.HashMap) map2).remove(v0Var.f311755d);
                }
            }
        }
    }

    public void b() {
        java.util.Map map = this.f348226h;
        int size = map.size();
        android.widget.ImageView imageView = this.f348225g;
        android.widget.TextView textView = this.f348224f;
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = this.f348222d;
        android.view.ViewGroup viewGroup = this.f348223e;
        if (size == 0) {
            textView.setText(composeUI.getString(com.tencent.mm.R.string.hjt) + " " + composeUI.getString(com.tencent.mm.R.string.hjw));
            imageView.setImageResource(com.tencent.mm.R.raw.qqmail_attach_icon_normal);
            android.view.View view = (android.view.View) viewGroup.getParent();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/FileUploadHelper", "changeSummary", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/qqmail/ui/FileUploadHelper", "changeSummary", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            textView.setText(composeUI.getString(com.tencent.mm.R.string.hjt) + composeUI.getResources().getQuantityString(com.tencent.mm.R.plurals.f489690a0, map.size(), java.lang.Integer.valueOf(map.size()), com.tencent.mm.sdk.platformtools.t8.f0(d())));
            imageView.setImageResource(com.tencent.mm.R.raw.qqmail_attach_icon_pressed);
            android.view.View view2 = (android.view.View) viewGroup.getParent();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/qqmail/ui/FileUploadHelper", "changeSummary", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/qqmail/ui/FileUploadHelper", "changeSummary", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            if (childCount == 1) {
                viewGroup.getChildAt(i17).setBackgroundResource(com.tencent.mm.R.drawable.an8);
            } else if (i17 == 0) {
                viewGroup.getChildAt(i17).setBackgroundResource(com.tencent.mm.R.drawable.an9);
            } else if (i17 <= 0 || i17 >= childCount - 1) {
                viewGroup.getChildAt(i17).setBackgroundResource(com.tencent.mm.R.drawable.ana);
            } else {
                viewGroup.getChildAt(i17).setBackgroundResource(com.tencent.mm.R.drawable.an_);
            }
        }
    }

    public final long c(java.lang.String str) {
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            com.tencent.mars.xlog.Log.i("MicroMsg.Mail.FileUploadHelper", "doNormalUpload %s", str, r6Var.getName());
            byte[] N = com.tencent.mm.vfs.w6.N(str, 0, (int) r6Var.C());
            ms3.a aVar = new ms3.a(str, (int) r6Var.C(), kk.r.a(java.security.MessageDigest.getInstance("SHA1").digest(N)), com.tencent.mm.sdk.platformtools.w2.b(N));
            gm0.j1.d().g(aVar);
            ((java.util.HashMap) this.f348227i).put(str, aVar);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mail.FileUploadHelper", e17, "", new java.lang.Object[0]);
        }
        return java.lang.System.currentTimeMillis();
    }

    public int d() {
        java.util.Map map = this.f348226h;
        java.util.Iterator it = map.keySet().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 = (int) (i17 + ((ks3.v0) map.get((java.lang.String) it.next())).f311757f);
        }
        return i17;
    }

    public java.util.LinkedList e() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Map map = this.f348226h;
        java.util.Iterator it = ((java.util.HashMap) map).keySet().iterator();
        while (it.hasNext()) {
            linkedList.add((ks3.v0) ((java.util.HashMap) map).get((java.lang.String) it.next()));
        }
        return linkedList;
    }

    public boolean f() {
        java.util.Map map = this.f348226h;
        java.util.Iterator it = ((java.util.HashMap) map).keySet().iterator();
        while (it.hasNext()) {
            int i17 = ((ks3.v0) ((java.util.HashMap) map).get((java.lang.String) it.next())).f311758g;
            if (i17 != 2 && i17 != 3) {
                return false;
            }
        }
        return true;
    }

    public final void g(ks3.v0 v0Var) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.f348223e.findViewById(java.lang.Math.abs(v0Var.f311755d.hashCode() / 2));
        if (linearLayout == null) {
            return;
        }
        os3.t1 t1Var = (os3.t1) linearLayout.getTag();
        com.tencent.mars.xlog.Log.i("MicroMsg.Mail.FileUploadHelper", "show upload status %d", java.lang.Integer.valueOf(v0Var.f311758g));
        int i17 = v0Var.f311758g;
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = this.f348222d;
        if (i17 == 0 || i17 == 1) {
            t1Var.f348204a.setTextColor(composeUI.getResources().getColor(com.tencent.mm.R.color.a0c));
            t1Var.f348205b.setVisibility(0);
            t1Var.f348206c.setVisibility(8);
            t1Var.f348207d.setVisibility(8);
            t1Var.f348208e.setVisibility(0);
            return;
        }
        if (i17 == 2) {
            t1Var.f348204a.setTextColor(composeUI.getResources().getColor(com.tencent.mm.R.color.a0c));
            t1Var.f348205b.setVisibility(8);
            t1Var.f348206c.setVisibility(8);
            t1Var.f348207d.setVisibility(8);
            t1Var.f348208e.setVisibility(0);
            return;
        }
        if (i17 != 3) {
            return;
        }
        t1Var.f348204a.setTextColor(i65.a.d(composeUI, com.tencent.mm.R.color.f479306vm));
        t1Var.f348205b.setVisibility(8);
        t1Var.f348206c.setVisibility(0);
        t1Var.f348207d.setVisibility(0);
        t1Var.f348208e.setVisibility(0);
    }

    public void h(java.util.List list) {
        if (list == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ks3.v0 v0Var = (ks3.v0) it.next();
            ((java.util.HashMap) this.f348226h).put(v0Var.f311755d, v0Var);
            i(v0Var);
        }
    }

    public final void i(ks3.v0 v0Var) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((android.view.ViewGroup) android.view.View.inflate(this.f348222d, com.tencent.mm.R.layout.cbf, null)).findViewById(com.tencent.mm.R.id.kxx);
        android.widget.ImageView imageView = (android.widget.ImageView) linearLayout.findViewById(com.tencent.mm.R.id.kxw);
        android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.kxy);
        android.widget.TextView textView2 = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.f486334ky0);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) linearLayout.findViewById(com.tencent.mm.R.id.f486335ky1);
        android.widget.TextView textView3 = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.f486336ky2);
        android.widget.ImageView imageView2 = (android.widget.ImageView) linearLayout.findViewById(com.tencent.mm.R.id.kxz);
        android.widget.ImageView imageView3 = (android.widget.ImageView) linearLayout.findViewById(com.tencent.mm.R.id.kxv);
        ((android.view.ViewGroup) linearLayout.getParent()).removeView(linearLayout);
        imageView.setImageResource(o25.y.b(v0Var.f311756e));
        textView.setText(v0Var.f311756e);
        textView2.setText(com.tencent.mm.sdk.platformtools.t8.f0(v0Var.f311757f));
        os3.t1 t1Var = new os3.t1(this, null);
        t1Var.f348204a = textView;
        t1Var.f348205b = progressBar;
        t1Var.f348206c = textView3;
        t1Var.f348207d = imageView2;
        t1Var.f348208e = imageView3;
        linearLayout.setTag(t1Var);
        linearLayout.setId(java.lang.Math.abs(v0Var.f311755d.hashCode() / 2));
        android.view.View.OnClickListener onClickListener = this.f348230o;
        if (onClickListener != null) {
            linearLayout.setOnClickListener(onClickListener);
        }
        android.view.ViewGroup viewGroup = this.f348223e;
        viewGroup.addView(linearLayout);
        b();
        linearLayout.setOnClickListener(new os3.n1(this, imageView2));
        imageView2.setOnClickListener(new os3.o1(this, v0Var));
        imageView3.setOnClickListener(new os3.q1(this, v0Var, linearLayout));
        viewGroup.post(new os3.r1(this, v0Var));
        if (v0Var.f311758g == 0) {
            v0Var.f311759h = c(v0Var.f311755d);
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.UploadCallback
    public void onC2CUploadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CUploadResult c2CUploadResult) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mail.FileUploadHelper", "onC2CUploadCompleted %s", str);
        java.util.Map map = this.f348228m;
        if (((java.util.HashMap) map).containsKey(str)) {
            com.tencent.mm.sdk.platformtools.u3.h(new os3.s1(this, (ks3.v0) ((java.util.HashMap) this.f348226h).get(((java.util.HashMap) map).get(str)), c2CUploadResult));
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() == 11665) {
            ms3.a aVar = (ms3.a) m1Var;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
            java.lang.String str2 = aVar.f330976f;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mail.FileUploadHelper", "errType %d, errCode %d, errMsg %s, filePath %s", valueOf, valueOf2, str, str2);
            ks3.v0 v0Var = (ks3.v0) ((java.util.HashMap) this.f348226h).get(str2);
            ((java.util.HashMap) this.f348227i).remove(str2);
            if (v0Var != null) {
                if (i17 != 0 || i18 != 0) {
                    v0Var.f311758g = 3;
                    g(v0Var);
                    return;
                }
                com.tencent.mars.cdn.CdnManager.C2CUploadRequest c2CUploadRequest = new com.tencent.mars.cdn.CdnManager.C2CUploadRequest();
                c2CUploadRequest.fileKey = aVar.f330977g;
                c2CUploadRequest.setFilePath2(str2);
                com.tencent.mm.modelbase.o oVar = aVar.f330974d;
                com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
                c2CUploadRequest.forwardFileid = ((ks3.b1) fVar).f311639g;
                c2CUploadRequest.host = ((ks3.b1) fVar).f311638f;
                ((java.util.HashMap) this.f348228m).put(c2CUploadRequest.fileKey, str2);
                v0Var.f311758g = 1;
                v0Var.f311760i = ((ks3.b1) oVar.f70711b.f70700a).f311636d;
                g(v0Var);
                ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startFtnUpload(c2CUploadRequest, this);
            }
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.UploadCallback
    public void onUploadProgressChanged(java.lang.String str, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mail.FileUploadHelper", "onUploadProgressChanged fileKey:%s finish:%d total:%d", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
    }
}
