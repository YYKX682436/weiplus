package k53;

/* loaded from: classes8.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f304392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k53.v f304393e;

    public u(k53.v vVar, android.graphics.Bitmap bitmap) {
        this.f304393e = vVar;
        this.f304392d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        k53.v vVar = this.f304393e;
        vVar.f304406e.f304340g.setVisibility(8);
        vVar.f304406e.f304339f.setImageBitmap(this.f304392d);
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoPreviewUI", "load thumb:%s", vVar.f304405d.f351607i);
    }
}
