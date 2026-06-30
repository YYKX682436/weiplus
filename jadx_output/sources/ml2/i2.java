package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.i2[] f327553d;

    static {
        ml2.i2[] i2VarArr = {new ml2.i2("FollowBtn", 0, 1), new ml2.i2("ReserveBtn", 1, 2), new ml2.i2("SendGift", 2, 3), new ml2.i2("GoToLiveRoom", 3, 4)};
        f327553d = i2VarArr;
        rz5.b.a(i2VarArr);
    }

    public i2(java.lang.String str, int i17, int i18) {
    }

    public static ml2.i2 valueOf(java.lang.String str) {
        return (ml2.i2) java.lang.Enum.valueOf(ml2.i2.class, str);
    }

    public static ml2.i2[] values() {
        return (ml2.i2[]) f327553d.clone();
    }
}
