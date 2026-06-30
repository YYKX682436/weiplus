package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class n9 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f190512a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.j8 f190513b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.h8 f190514c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.SharedPreferences f190515d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f190516e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f190517f;

    /* renamed from: h, reason: collision with root package name */
    public db5.d5 f190519h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f190520i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f190521j;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.i8 f190523l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.m9 f190524m;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f190518g = null;

    /* renamed from: k, reason: collision with root package name */
    public boolean f190522k = true;

    public n9(android.content.Context context, android.view.View view, android.view.View view2, com.tencent.mm.pluginsdk.ui.chat.m9 m9Var) {
        this.f190516e = null;
        this.f190517f = null;
        this.f190512a = context;
        this.f190520i = view;
        this.f190521j = view2;
        this.f190513b = new com.tencent.mm.pluginsdk.ui.chat.j8(context);
        this.f190515d = context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
        this.f190524m = m9Var;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488439tc, null);
        this.f190516e = inflate;
        this.f190517f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.llu);
        db5.d5 d5Var = new db5.d5(this.f190516e, -2, -2, false);
        this.f190519h = d5Var;
        d5Var.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        this.f190519h.setOutsideTouchable(true);
        this.f190516e.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.i9(this));
    }

    public final float a(int i17) {
        return android.util.TypedValue.applyDimension(1, i17, this.f190512a.getResources().getDisplayMetrics());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b2, code lost:
    
        if (r0.moveToFirst() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b4, code lost:
    
        r3 = r0.getString(r0.getColumnIndexOrThrow("_id"));
        r6 = r0.getString(r0.getColumnIndexOrThrow("_data"));
        r7 = r0.getString(r0.getColumnIndexOrThrow("date_added"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d0, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r6) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d6, code lost:
    
        if (com.tencent.mm.vfs.w6.j(r6) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e1, code lost:
    
        if (r6.startsWith(lp0.b.m()) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e3, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentPhotoTips.ImageQuery", "exclude weixin path image");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x012c, code lost:
    
        if (r0.moveToNext() != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
    
        r8 = new com.tencent.mm.pluginsdk.ui.chat.h8();
        r8.f190351a = com.tencent.mm.sdk.platformtools.t8.V(r3, r1);
        r8.f190353c = com.tencent.mm.sdk.platformtools.t8.V(r7, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fe, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r6) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0104, code lost:
    
        if (com.tencent.mm.vfs.w6.j(r6) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0106, code lost:
    
        r8.f190352b = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010e, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r8.f190352b) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0116, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r8.f190352b) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0118, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.RecentPhotoTips.ImageQuery", "thumb file and orignal file both not exist");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011f, code lost:
    
        r5.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0123, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.RecentPhotoTips.ImageQuery", "file not exist");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012e, code lost:
    
        r0.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.pluginsdk.ui.chat.h8 b() {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.chat.n9.b():com.tencent.mm.pluginsdk.ui.chat.h8");
    }
}
