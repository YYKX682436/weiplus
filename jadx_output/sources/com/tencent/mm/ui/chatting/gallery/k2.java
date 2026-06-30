package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public class k2 extends com.tencent.mm.ui.z9 implements android.view.View.OnClickListener {

    /* renamed from: w, reason: collision with root package name */
    public static final java.util.Map f201111w;

    /* renamed from: x, reason: collision with root package name */
    public static final java.util.Map f201112x;

    /* renamed from: o, reason: collision with root package name */
    public android.view.LayoutInflater f201113o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f201114p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f201115q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f201116r;

    /* renamed from: s, reason: collision with root package name */
    public final long f201117s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI f201118t;

    /* renamed from: u, reason: collision with root package name */
    public o11.g f201119u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f201120v;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f201111w = hashMap;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.raw.app_attach_file_icon_video_in_gird);
        hashMap.put("avi", valueOf);
        hashMap.put("m4v", valueOf);
        hashMap.put("vob", valueOf);
        hashMap.put("mpeg", valueOf);
        hashMap.put("mpe", valueOf);
        hashMap.put("asx", valueOf);
        hashMap.put("asf", valueOf);
        hashMap.put("f4v", valueOf);
        hashMap.put("flv", valueOf);
        hashMap.put("mkv", valueOf);
        hashMap.put("wmv", valueOf);
        hashMap.put("wm", valueOf);
        hashMap.put("3gp", valueOf);
        hashMap.put("mp4", valueOf);
        hashMap.put("rmvb", valueOf);
        hashMap.put("rm", valueOf);
        hashMap.put("ra", valueOf);
        hashMap.put("ram", valueOf);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.tencent.mm.R.raw.app_attach_file_icon_music_in_gird);
        hashMap.put("mp3pro", valueOf2);
        hashMap.put("vqf", valueOf2);
        hashMap.put("cd", valueOf2);
        hashMap.put("md", valueOf2);
        hashMap.put("mod", valueOf2);
        hashMap.put("vorbis", valueOf2);
        hashMap.put("au", valueOf2);
        hashMap.put("amr", valueOf2);
        hashMap.put("silk", valueOf2);
        hashMap.put("wma", valueOf2);
        hashMap.put("mmf", valueOf2);
        hashMap.put("mid", valueOf2);
        hashMap.put("midi", valueOf2);
        hashMap.put("mp3", valueOf2);
        hashMap.put("aac", valueOf2);
        hashMap.put("ape", valueOf2);
        hashMap.put("aiff", valueOf2);
        hashMap.put("aif", valueOf2);
        hashMap.put("doc", java.lang.Integer.valueOf(com.tencent.mm.R.raw.app_attach_file_icon_word_in_gird));
        hashMap.put("docx", java.lang.Integer.valueOf(com.tencent.mm.R.raw.app_attach_file_icon_word_in_gird));
        hashMap.put("ppt", java.lang.Integer.valueOf(com.tencent.mm.R.raw.app_attach_file_icon_ppt_in_gird));
        hashMap.put("pptx", java.lang.Integer.valueOf(com.tencent.mm.R.raw.app_attach_file_icon_ppt_in_gird));
        hashMap.put("xls", java.lang.Integer.valueOf(com.tencent.mm.R.raw.app_attach_file_icon_excel_in_gird));
        hashMap.put("xlsx", java.lang.Integer.valueOf(com.tencent.mm.R.raw.app_attach_file_icon_excel_in_gird));
        hashMap.put("pdf", java.lang.Integer.valueOf(com.tencent.mm.R.raw.app_attach_file_icon_pdf_in_gird));
        hashMap.put(com.eclipsesource.mmv8.Platform.UNKNOWN, java.lang.Integer.valueOf(com.tencent.mm.R.raw.app_attach_file_icon_unknow_in_gird));
        java.util.HashMap hashMap2 = new java.util.HashMap();
        f201112x = hashMap2;
        hashMap2.put("doc", java.lang.Integer.valueOf(com.tencent.mm.R.color.f478624cj));
        hashMap2.put("docx", java.lang.Integer.valueOf(com.tencent.mm.R.color.f478624cj));
        hashMap2.put("ppt", java.lang.Integer.valueOf(com.tencent.mm.R.color.f478627cm));
        hashMap2.put("pptx", java.lang.Integer.valueOf(com.tencent.mm.R.color.f478627cm));
        hashMap2.put("xls", java.lang.Integer.valueOf(com.tencent.mm.R.color.f478630cp));
        hashMap2.put("xlsx", java.lang.Integer.valueOf(com.tencent.mm.R.color.f478630cp));
        hashMap2.put("pdf", java.lang.Integer.valueOf(com.tencent.mm.R.color.f478626cl));
        hashMap2.put(com.eclipsesource.mmv8.Platform.UNKNOWN, java.lang.Integer.valueOf(com.tencent.mm.R.color.f478628cn));
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(com.tencent.mm.R.color.f478625ck);
        hashMap2.put("mp3pro", valueOf3);
        hashMap2.put("vqf", valueOf3);
        hashMap2.put("cd", valueOf3);
        hashMap2.put("md", valueOf3);
        hashMap2.put("mod", valueOf3);
        hashMap2.put("vorbis", valueOf3);
        hashMap2.put("au", valueOf3);
        hashMap2.put("amr", valueOf3);
        hashMap2.put("silk", valueOf3);
        hashMap2.put("wma", valueOf3);
        hashMap2.put("mmf", valueOf3);
        hashMap2.put("mid", valueOf3);
        hashMap2.put("midi", valueOf3);
        hashMap2.put("mp3", valueOf3);
        hashMap2.put("aac", valueOf3);
        hashMap2.put("ape", valueOf3);
        hashMap2.put("aiff", valueOf3);
        hashMap2.put("aif", valueOf3);
    }

    public k2(android.content.Context context, com.tencent.mm.storage.f9 f9Var, long j17, java.lang.String str) {
        super(context, f9Var);
        this.f201119u = null;
        this.f201120v = false;
        this.f201118t = (com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI) context;
        this.f201115q = str;
        ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
        boolean g17 = r01.z.g(str);
        this.f201116r = g17;
        if (g17) {
            this.f201117s = j17;
        }
        this.f201114p = c01.d9.b().E();
        this.f201113o = android.view.LayoutInflater.from(context);
        o11.f fVar = new o11.f();
        fVar.f342085i = 1;
        fVar.f342098v = true;
        fVar.f342087k = i65.a.B(context) / 3;
        fVar.f342086j = i65.a.B(context) / 3;
        fVar.f342093q = com.tencent.mm.R.color.a0y;
        this.f201119u = fVar.a();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.convertFrom(cursor);
        return f9Var;
    }

    @Override // com.tencent.mm.ui.z9, android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.chatting.gallery.j2 j2Var;
        android.view.View view2;
        android.view.View view3;
        if (view == null) {
            view2 = this.f201113o.inflate(com.tencent.mm.R.layout.f489179bk5, viewGroup, false);
            j2Var = new com.tencent.mm.ui.chatting.gallery.j2();
            j2Var.f201046a = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.gtj);
            j2Var.f201048c = view2.findViewById(com.tencent.mm.R.id.p0s);
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.e2b);
            j2Var.f201049d = textView;
            textView.setVisibility(8);
            j2Var.f201047b = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.f484376e25);
            j2Var.f201050e = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.p0p);
            android.view.View view4 = j2Var.f201048c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.mwq);
            j2Var.f201052g = findViewById;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = view2.findViewById(com.tencent.mm.R.id.e2j);
            j2Var.f201053h = findViewById2;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            j2Var.f201051f = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.gtn);
            j2Var.f201054i = (android.widget.CheckBox) view2.findViewById(com.tencent.mm.R.id.jdh);
            j2Var.f201055j = view2.findViewById(com.tencent.mm.R.id.jdi);
            view2.setTag(j2Var);
        } else {
            j2Var = (com.tencent.mm.ui.chatting.gallery.j2) view.getTag();
            view2 = view;
        }
        android.view.View view5 = j2Var.f201052g;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = j2Var.f201048c;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view7 = j2Var.f201053h;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        j2Var.f201049d.setVisibility(8);
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) getItem(i17);
        if (f9Var == null) {
            return view2;
        }
        if (this.f201114p) {
            com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI imageGalleryGridUI = this.f201118t;
            if (!(imageGalleryGridUI instanceof com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI)) {
                throw new java.lang.IllegalArgumentException("the context should be ImageGalleryGridUI");
            }
            ot0.q v17 = ot0.q.v(f9Var.U1());
            if (imageGalleryGridUI.f200570g == i17) {
                j2Var.f201051f.setVisibility(0);
                if (!com.tencent.mm.ui.chatting.gallery.k1.F(f9Var) || v17 == null || v17.f348666i == 3) {
                    if (v17 != null && v17.f348666i == 3) {
                        j2Var.f201047b.setImageDrawable(imageGalleryGridUI.getResources().getDrawable(u(v17)));
                    }
                    n11.a.b().j(v(f9Var), j2Var.f201046a, this.f201119u, new com.tencent.mm.ui.chatting.gallery.i2(this));
                } else {
                    j2Var.f201047b.setImageDrawable(imageGalleryGridUI.getResources().getDrawable(u(v17)));
                    j2Var.f201046a.setImageResource(t(v17));
                }
            } else {
                j2Var.f201051f.setVisibility(0);
                j2Var.f201051f.setBackgroundResource(com.tencent.mm.R.color.f479266uj);
                if (!com.tencent.mm.ui.chatting.gallery.k1.F(f9Var) || v17 == null || v17.f348666i == 3) {
                    if (v17 != null && v17.f348666i == 3) {
                        j2Var.f201047b.setImageDrawable(imageGalleryGridUI.getResources().getDrawable(u(v17)));
                    }
                    n11.a.b().h(v(f9Var), j2Var.f201046a, this.f201119u);
                } else {
                    j2Var.f201047b.setImageDrawable(imageGalleryGridUI.getResources().getDrawable(u(v17)));
                    j2Var.f201046a.setImageResource(t(v17));
                }
            }
            j2Var.f201046a.setPadding(0, 0, 0, 0);
            int measuredWidth = j2Var.f201046a.getMeasuredWidth();
            int measuredHeight = j2Var.f201046a.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                android.view.ViewGroup.LayoutParams layoutParams = j2Var.f201051f.getLayoutParams();
                layoutParams.width = measuredWidth;
                layoutParams.height = measuredHeight;
                j2Var.f201051f.setLayoutParams(layoutParams);
            }
            if (com.tencent.mm.ui.chatting.gallery.k1.N(f9Var)) {
                android.view.View view8 = j2Var.f201048c;
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(0);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "initVideoTips", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter$ViewHolder;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "initVideoTips", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter$ViewHolder;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                t21.v2 s17 = com.tencent.mm.ui.chatting.gallery.j1.s(f9Var);
                if (s17 != null) {
                    j2Var.f201050e.setText(com.tencent.mm.sdk.platformtools.t8.u(s17.f415015m));
                }
            } else if (com.tencent.mm.ui.chatting.gallery.k1.M(f9Var)) {
                android.view.View view9 = j2Var.f201052g;
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view9, arrayList8.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (com.tencent.mm.ui.chatting.gallery.k1.F(f9Var)) {
                android.view.View view10 = j2Var.f201053h;
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                arrayList9.add(0);
                java.util.Collections.reverse(arrayList9);
                view3 = view2;
                yj0.a.d(view10, arrayList9.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "initFileName", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter$ViewHolder;Lcom/tencent/mm/message/AppMessage$Content;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view10, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "initFileName", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter$ViewHolder;Lcom/tencent/mm/message/AppMessage$Content;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                j2Var.f201049d.setVisibility(0);
                if (v17 != null) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    java.lang.String str = v17.f348654f;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str == null) {
                        str = "";
                    }
                    objArr[0] = str;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryGridAdapter", "initFileName--->content:%s", objArr);
                    if (v17.f348666i != 24) {
                        android.widget.TextView textView2 = j2Var.f201049d;
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        java.lang.String str2 = v17.f348654f;
                        java.lang.String str3 = str2 != null ? str2 : "";
                        float textSize = j2Var.f201049d.getTextSize();
                        ((ke0.e) xVar).getClass();
                        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(null, str3, textSize));
                    } else {
                        android.widget.TextView textView3 = j2Var.f201049d;
                        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                        android.content.Context context = j2Var.f201049d.getContext();
                        java.lang.String string = j2Var.f201049d.getContext().getString(com.tencent.mm.R.string.f491221ce2);
                        float textSize2 = j2Var.f201049d.getTextSize();
                        ((ke0.e) xVar2).getClass();
                        textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, string, textSize2));
                    }
                }
            }
            view3 = view2;
        } else {
            view3 = view2;
            j2Var.f201046a.setImageResource(com.tencent.mm.R.drawable.bkr);
        }
        android.widget.CheckBox checkBox = j2Var.f201054i;
        com.tencent.mm.ui.chatting.gallery.r4 r4Var = com.tencent.mm.ui.chatting.gallery.p4.f201265a;
        checkBox.setChecked(r4Var.d(f9Var));
        j2Var.f201054i.setTag(f9Var);
        j2Var.f201055j.setTag(j2Var);
        j2Var.f201055j.setOnClickListener(this);
        if (r4Var.f201334b) {
            j2Var.f201054i.setVisibility(0);
            android.view.View view11 = j2Var.f201055j;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view11, arrayList10.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view11, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            j2Var.f201051f.setVisibility(0);
        } else {
            j2Var.f201054i.setVisibility(8);
            android.view.View view12 = j2Var.f201055j;
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view12, arrayList11.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view12, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            j2Var.f201051f.setVisibility(8);
        }
        return view3;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        boolean z17 = this.f201116r;
        java.lang.String str = this.f201115q;
        if (z17) {
            s(c01.d9.b().j().j(str, this.f201117s));
        } else {
            s(((com.tencent.mm.storage.g9) c01.d9.b().u()).o1(str));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.gallery.j2 j2Var = (com.tencent.mm.ui.chatting.gallery.j2) view.getTag();
        android.widget.CheckBox checkBox = j2Var.f201054i;
        if (checkBox == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) checkBox.getTag();
        if (f9Var == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.ui.chatting.gallery.r4 r4Var = com.tencent.mm.ui.chatting.gallery.p4.f201265a;
        if (r4Var.d(f9Var)) {
            r4Var.e(f9Var);
        } else {
            r4Var.a(f9Var);
        }
        if (r4Var.d(f9Var)) {
            j2Var.f201054i.setChecked(true);
            j2Var.f201051f.setBackgroundResource(com.tencent.mm.R.color.t_);
        } else {
            j2Var.f201054i.setChecked(false);
            j2Var.f201051f.setBackgroundResource(com.tencent.mm.R.color.f479266uj);
        }
        if (!this.f201120v && r4Var.f201333a.size() > 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 20L, 1L, true);
            this.f201120v = true;
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        boolean z17 = this.f201116r;
        java.lang.String str = this.f201115q;
        if (z17) {
            s(c01.d9.b().j().j(str, this.f201117s));
        } else {
            s(((com.tencent.mm.storage.g9) c01.d9.b().u()).o1(str));
        }
    }

    public final int t(ot0.q qVar) {
        if (qVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryGridAdapter", "getIconId:2131100408");
            return com.tencent.mm.R.color.f478628cn;
        }
        int i17 = qVar.f348666i;
        if (i17 == 5 || i17 == 7 || i17 == 15) {
            return com.tencent.mm.R.color.f478629co;
        }
        if (ez.v0.f257777a.j(java.lang.Integer.valueOf(i17))) {
            java.util.Map map = f201112x;
            java.lang.String str = qVar.f348690o;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            if (((java.util.HashMap) map).containsKey(str)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getIconId:");
                java.lang.String str2 = qVar.f348690o;
                if (str2 == null) {
                    str2 = "";
                }
                sb6.append(((java.util.HashMap) map).get(str2));
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryGridAdapter", sb6.toString());
                java.lang.String str3 = qVar.f348690o;
                return ((java.lang.Integer) ((java.util.HashMap) map).get(str3 != null ? str3 : "")).intValue();
            }
        }
        return com.tencent.mm.R.color.f478628cn;
    }

    public final int u(ot0.q qVar) {
        if (qVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryGridAdapter", "getIconId:2131689566");
            return com.tencent.mm.R.raw.app_attach_file_icon_unknow_in_gird;
        }
        int i17 = qVar.f348666i;
        if (i17 == 5 || i17 == 7 || i17 == 15) {
            return com.tencent.mm.R.raw.app_attach_file_icon_url_in_gird;
        }
        if (i17 == 3) {
            return com.tencent.mm.R.raw.music_default;
        }
        if (ez.v0.f257777a.j(java.lang.Integer.valueOf(i17))) {
            java.util.Map map = f201111w;
            java.lang.String str = qVar.f348690o;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            if (((java.util.HashMap) map).containsKey(str)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getIconId:");
                java.lang.String str2 = qVar.f348690o;
                if (str2 == null) {
                    str2 = "";
                }
                sb6.append(((java.util.HashMap) map).get(str2));
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryGridAdapter", sb6.toString());
                java.lang.String str3 = qVar.f348690o;
                return ((java.lang.Integer) ((java.util.HashMap) map).get(str3 != null ? str3 : "")).intValue();
            }
        }
        return com.tencent.mm.R.raw.app_attach_file_icon_unknow_in_gird;
    }

    public final java.lang.String v(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String tj6;
        java.lang.String str;
        com.tencent.mm.pluginsdk.model.app.d D0;
        if (f9Var.isVideo() || f9Var.Y2()) {
            tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, f9Var.z0(), false);
        } else {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            tj6 = m11.b1.Di().D2(f9Var, f9Var.z0(), false);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(tj6) && !tj6.endsWith("hd") && com.tencent.mm.vfs.w6.j(tj6.concat("hd"))) {
                tj6 = tj6.concat("hd");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryGridAdapter", "MsgInfoForMonetUri imgPath : %s", tj6);
        if (!f9Var.o2()) {
            return tj6;
        }
        ot0.q v17 = ot0.q.v(f9Var.j());
        java.lang.String str2 = (v17 == null || (str = v17.f348694p) == null || str.length() <= 0 || (D0 = com.tencent.mm.pluginsdk.model.app.u5.wi().D0(v17.f348694p)) == null) ? null : D0.field_fileFullPath;
        return str2 != null ? str2 : tj6;
    }
}
