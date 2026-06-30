package yw0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final yw0.c f466535d;

    /* renamed from: e, reason: collision with root package name */
    public static final yw0.c f466536e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ yw0.c[] f466537f;

    static {
        yw0.c cVar = new yw0.c("Interacting", 0);
        f466535d = cVar;
        yw0.c cVar2 = new yw0.c("Idle", 1);
        f466536e = cVar2;
        yw0.c[] cVarArr = {cVar, cVar2};
        f466537f = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static yw0.c valueOf(java.lang.String str) {
        return (yw0.c) java.lang.Enum.valueOf(yw0.c.class, str);
    }

    public static yw0.c[] values() {
        return (yw0.c[]) f466537f.clone();
    }
}
