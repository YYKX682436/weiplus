package ru0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ru0.c[] f399659d;

    static {
        ru0.c[] cVarArr = {new ru0.c("NO_USE", 0, 0), new ru0.c("MAAS_SDK", 1, 1), new ru0.c("VOIP_3A", 2, 2)};
        f399659d = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, int i18) {
    }

    public static ru0.c valueOf(java.lang.String str) {
        return (ru0.c) java.lang.Enum.valueOf(ru0.c.class, str);
    }

    public static ru0.c[] values() {
        return (ru0.c[]) f399659d.clone();
    }
}
