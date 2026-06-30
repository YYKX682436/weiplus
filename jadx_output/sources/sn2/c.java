package sn2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final sn2.c f410120e;

    /* renamed from: f, reason: collision with root package name */
    public static final sn2.c f410121f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ sn2.c[] f410122g;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f410123d;

    static {
        sn2.c cVar = new sn2.c("NOTIFY_PLAYING", 0, "NOTIFY_PLAYING");
        sn2.c cVar2 = new sn2.c("NOTIFY_PAUSED", 1, "NOTIFY_PAUSED");
        sn2.c cVar3 = new sn2.c("SHOW_CONTROLS", 2, "SHOW_CONTROLS");
        f410120e = cVar3;
        sn2.c cVar4 = new sn2.c("HIDE_CONTROLS", 3, "HIDE_CONTROLS");
        f410121f = cVar4;
        sn2.c[] cVarArr = {cVar, cVar2, cVar3, cVar4, new sn2.c("UPDATE_LIVE_INFO", 4, "UPDATE_LIVE_INFO")};
        f410122g = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, java.lang.String str2) {
        this.f410123d = str2;
    }

    public static sn2.c valueOf(java.lang.String str) {
        return (sn2.c) java.lang.Enum.valueOf(sn2.c.class, str);
    }

    public static sn2.c[] values() {
        return (sn2.c[]) f410122g.clone();
    }
}
