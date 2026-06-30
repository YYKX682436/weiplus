package fp3;

/* loaded from: classes9.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f265315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fp3.n f265316e;

    public m(fp3.n nVar, android.graphics.Bitmap bitmap) {
        this.f265316e = nVar;
        this.f265315d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f265316e.f265317d.setImageBitmap(this.f265315d);
    }
}
