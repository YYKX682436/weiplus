package ta;

/* loaded from: classes8.dex */
public class a implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.search.verification.client.SearchActionVerificationClientService f416595d;

    public a(com.google.android.search.verification.client.SearchActionVerificationClientService searchActionVerificationClientService) {
        this.f416595d = searchActionVerificationClientService;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        sa.c aVar;
        com.google.android.search.verification.client.SearchActionVerificationClientService searchActionVerificationClientService = this.f416595d;
        boolean z17 = searchActionVerificationClientService.f44632d;
        int i17 = sa.b.f405248d;
        if (iBinder == null) {
            aVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof sa.c)) ? new sa.a(iBinder) : (sa.c) queryLocalInterface;
        }
        searchActionVerificationClientService.f44636h = aVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.search.verification.client.SearchActionVerificationClientService searchActionVerificationClientService = this.f416595d;
        searchActionVerificationClientService.f44636h = null;
        boolean z17 = searchActionVerificationClientService.f44632d;
    }
}
