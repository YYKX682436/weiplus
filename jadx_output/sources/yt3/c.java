package yt3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final yt3.c f465373d;

    /* renamed from: e, reason: collision with root package name */
    public static final yt3.c f465374e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ yt3.c[] f465375f;

    static {
        yt3.c cVar = new yt3.c("FLASH_ON", 0);
        f465373d = cVar;
        yt3.c cVar2 = new yt3.c("FLASH_OFF", 1);
        f465374e = cVar2;
        yt3.c[] cVarArr = {cVar, cVar2};
        f465375f = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static yt3.c valueOf(java.lang.String str) {
        return (yt3.c) java.lang.Enum.valueOf(yt3.c.class, str);
    }

    public static yt3.c[] values() {
        return (yt3.c[]) f465375f.clone();
    }
}
