package q70;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final q70.c f360317d;

    /* renamed from: e, reason: collision with root package name */
    public static final q70.c f360318e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ q70.c[] f360319f;

    static {
        q70.c cVar = new q70.c("Success", 0);
        f360317d = cVar;
        q70.c cVar2 = new q70.c("Error", 1);
        f360318e = cVar2;
        q70.c[] cVarArr = {cVar, cVar2};
        f360319f = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static q70.c valueOf(java.lang.String str) {
        return (q70.c) java.lang.Enum.valueOf(q70.c.class, str);
    }

    public static q70.c[] values() {
        return (q70.c[]) f360319f.clone();
    }
}
