package j65;

/* loaded from: classes.dex */
public class i extends java.util.ArrayList {
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("InterceptArrayList", "InterceptArrayList.add");
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("InterceptArrayList", "InterceptArrayList.add index object");
    }
}
