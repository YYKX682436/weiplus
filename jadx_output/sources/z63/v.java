package z63;

/* loaded from: classes5.dex */
public class v implements java.util.Comparator {
    public v(com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num = (java.lang.Integer) obj;
        java.lang.Integer num2 = (java.lang.Integer) obj2;
        if (num.intValue() < num2.intValue()) {
            return 1;
        }
        return num == num2 ? 0 : -1;
    }
}
