package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public class d1 extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f210338a;

    /* renamed from: b, reason: collision with root package name */
    public android.app.ProgressDialog f210339b;

    /* renamed from: c, reason: collision with root package name */
    public android.net.Uri f210340c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f210341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f210342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragment f210343f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210344g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.h1 f210345h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f210346i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f210347j;

    public d1(android.content.Intent intent, com.tencent.mm.ui.MMFragment mMFragment, java.lang.String str, com.tencent.mm.ui.tools.h1 h1Var, android.content.Intent intent2, int i17) {
        this.f210342e = intent;
        this.f210343f = mMFragment;
        this.f210344g = str;
        this.f210345h = h1Var;
        this.f210346i = intent2;
        this.f210347j = i17;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        try {
            android.net.Uri uri = this.f210340c;
            if (uri == null) {
                return null;
            }
            this.f210338a = com.tencent.mm.ui.tools.i1.c(this.f210344g, com.tencent.mm.sdk.platformtools.x.f0(0, null, null, uri, false, 0.0f, 0, 0));
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AsyncObtainImage", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        if (!this.f210341d && !com.tencent.mm.sdk.platformtools.t8.K0(this.f210338a)) {
            android.content.Intent intent = this.f210346i;
            com.tencent.mm.ui.tools.h1 h1Var = this.f210345h;
            if (h1Var != null) {
                intent.putExtra("CropImage_OutputPath", h1Var.a(this.f210338a));
            }
            intent.putExtra("CropImage_ImgPath", this.f210338a);
            this.f210343f.startActivityForResult(intent, this.f210347j);
        }
        this.f210339b.dismiss();
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        com.tencent.mm.ui.MMFragment mMFragment = this.f210343f;
        try {
            this.f210340c = this.f210342e.getData();
            this.f210341d = false;
            this.f210339b = db5.e1.Q(mMFragment.getContext(), mMFragment.getString(com.tencent.mm.R.string.f490573yv), mMFragment.getString(com.tencent.mm.R.string.f490451vf), true, true, new com.tencent.mm.ui.tools.c1(this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AsyncObtainImage", e17, "", new java.lang.Object[0]);
        }
    }
}
