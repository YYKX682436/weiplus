package js4;

/* loaded from: classes.dex */
public enum l {
    present,
    /* JADX INFO: Fake field, exist only in values array */
    push;

    public static js4.l a(java.lang.String str) {
        for (js4.l lVar : values()) {
            if (lVar.toString().equals(str)) {
                return lVar;
            }
        }
        return present;
    }
}
