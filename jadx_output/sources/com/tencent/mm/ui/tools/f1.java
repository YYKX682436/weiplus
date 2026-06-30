package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public class f1 extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f210386a;

    /* renamed from: b, reason: collision with root package name */
    public android.app.ProgressDialog f210387b;

    /* renamed from: c, reason: collision with root package name */
    public android.net.Uri f210388c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f210389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f210390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f210391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210392g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.h1 f210393h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f210394i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f210395j;

    public f1(android.content.Intent intent, android.app.Activity activity, java.lang.String str, com.tencent.mm.ui.tools.h1 h1Var, android.content.Intent intent2, int i17) {
        this.f210390e = intent;
        this.f210391f = activity;
        this.f210392g = str;
        this.f210393h = h1Var;
        this.f210394i = intent2;
        this.f210395j = i17;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        try {
            android.net.Uri uri = this.f210388c;
            if (uri == null) {
                return null;
            }
            this.f210386a = com.tencent.mm.ui.tools.i1.c(this.f210392g, com.tencent.mm.sdk.platformtools.x.f0(0, null, null, uri, false, 0.0f, 0, 0));
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AsyncObtainImage", e17, "doInBackground", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        if (this.f210389d || com.tencent.mm.sdk.platformtools.t8.K0(this.f210386a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AsyncObtainImage", "onPostExecute error, filePath:%s", this.f210386a);
        } else {
            android.content.Intent intent = this.f210394i;
            com.tencent.mm.ui.tools.h1 h1Var = this.f210393h;
            if (h1Var != null) {
                intent.putExtra("CropImage_OutputPath", h1Var.a(this.f210386a));
            }
            intent.putExtra("CropImage_ImgPath", this.f210386a);
            android.app.Activity activity = this.f210391f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(this.f210395j));
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/ui/tools/AsyncObtainImage$2", "onPostExecute", "(Ljava/lang/Integer;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        this.f210387b.dismiss();
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        try {
            this.f210388c = this.f210390e.getData();
            this.f210389d = false;
            android.app.Activity activity = this.f210391f;
            this.f210387b = db5.e1.Q(activity, activity.getString(com.tencent.mm.R.string.f490573yv), this.f210391f.getString(com.tencent.mm.R.string.f490451vf), true, true, new com.tencent.mm.ui.tools.e1(this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AsyncObtainImage", e17, "onPreExecute", new java.lang.Object[0]);
        }
    }
}
