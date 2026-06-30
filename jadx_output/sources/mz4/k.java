package mz4;

/* loaded from: classes2.dex */
public class k extends java.util.ArrayList {
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteEditorDataList", "add %s", obj);
        return super.add(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection collection) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteEditorDataList", "addAll %s size %s", collection, java.lang.Integer.valueOf(collection.size()));
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteEditorDataList", "clear");
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteEditorDataList", "remove index %s", java.lang.Integer.valueOf(i17));
        return super.remove(i17);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection collection) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteEditorDataList", "removeAll %s size %s", collection, java.lang.Integer.valueOf(collection.size()));
        return super.removeAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public void removeRange(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteEditorDataList", "removeRange %s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        super.removeRange(i17, i18);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteEditorDataList", "set index %s element %s", java.lang.Integer.valueOf(i17), obj);
        return super.set(i17, obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteEditorDataList", "add index %s element %s", java.lang.Integer.valueOf(i17), obj);
        super.add(i17, obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i17, java.util.Collection collection) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteEditorDataList", "addAll index %s %s size %s", java.lang.Integer.valueOf(i17), collection, java.lang.Integer.valueOf(collection.size()));
        return super.addAll(i17, collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteEditorDataList", "remove object %s", obj);
        return super.remove(obj);
    }
}
