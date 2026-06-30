package k91;

/* loaded from: classes.dex */
public abstract class a6 {
    public static java.util.LinkedList a(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            linkedList.add(jSONArray.optString(i17));
        }
        return linkedList;
    }
}
