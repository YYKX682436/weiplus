package dx5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final dx5.c f244507d;

    /* renamed from: e, reason: collision with root package name */
    public static final dx5.c f244508e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ dx5.c[] f244509f;

    static {
        dx5.c cVar = new dx5.c(com.google.android.gms.iid.InstanceID.ERROR_TIMEOUT, 0);
        f244507d = cVar;
        dx5.c cVar2 = new dx5.c("REDIRECT", 1);
        dx5.c cVar3 = new dx5.c("CANCEL", 2);
        f244508e = cVar3;
        dx5.c[] cVarArr = {cVar, cVar2, cVar3};
        f244509f = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static dx5.c valueOf(java.lang.String str) {
        return (dx5.c) java.lang.Enum.valueOf(dx5.c.class, str);
    }

    public static dx5.c[] values() {
        return (dx5.c[]) f244509f.clone();
    }
}
