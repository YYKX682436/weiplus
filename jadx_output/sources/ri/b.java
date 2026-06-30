package ri;

/* loaded from: classes.dex */
public class b extends java.util.LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(java.util.Map.Entry entry) {
        return size() > 100;
    }
}
