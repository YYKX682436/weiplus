package mb;

/* loaded from: classes9.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final mb.j f325280a;

    /* renamed from: b, reason: collision with root package name */
    public final mb.g f325281b;

    /* renamed from: c, reason: collision with root package name */
    public final mb.c f325282c;

    /* renamed from: d, reason: collision with root package name */
    public mb.d f325283d;

    /* renamed from: e, reason: collision with root package name */
    public int f325284e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.IBinder.DeathRecipient f325285f;

    public e(mb.j jVar, android.os.Looper looper, int i17) {
        mb.a aVar = new mb.a(this);
        this.f325285f = aVar;
        this.f325280a = jVar;
        mb.c cVar = new mb.c(this, looper);
        mb.b bVar = new mb.b(this);
        this.f325281b = bVar;
        mb.h hVar = (mb.h) jVar;
        hVar.getClass();
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
            obtain.writeStrongBinder(bVar.asBinder());
            obtain.writeInt(i17);
            hVar.f325286d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (!(obtain2.readInt() != 0)) {
                throw new java.lang.RuntimeException();
            }
            this.f325282c = cVar;
            jVar.asBinder().linkToDeath(aVar, 0);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static mb.j a() {
        android.os.IBinder service = android.os.ServiceManager.getService("authentication_service");
        int i17 = mb.i.f325287d;
        if (service == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = service.queryLocalInterface("com.huawei.securitymgr.IAuthenticationService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof mb.j)) ? new mb.h(service) : (mb.j) queryLocalInterface;
    }

    public void b() {
        mb.j jVar = this.f325280a;
        mb.c cVar = this.f325282c;
        if (cVar != null) {
            cVar.removeMessages(8);
        }
        try {
            ((mb.h) jVar).g(this.f325281b);
            jVar.asBinder().unlinkToDeath(this.f325285f, 0);
        } catch (android.os.RemoteException unused) {
        }
    }
}
