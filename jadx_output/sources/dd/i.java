package dd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ dd.i[] f228880d;

    static {
        dd.i[] iVarArr = {new dd.i("LiteAppAddPayCardResultUnknown", 0, 0), new dd.i("LiteAppAddPayCardResultSuccess", 1, 1), new dd.i("LiteAppAddPayCardResultCancel", 2, 2), new dd.i("LiteAppAddPayCardResultAfterRename", 3, 3), new dd.i("LiteAppAddPayCardResultResetPwd", 4, 4)};
        f228880d = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17, int i18) {
    }

    public static dd.i valueOf(java.lang.String str) {
        return (dd.i) java.lang.Enum.valueOf(dd.i.class, str);
    }

    public static dd.i[] values() {
        return (dd.i[]) f228880d.clone();
    }
}
