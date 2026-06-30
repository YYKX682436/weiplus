package vl5;

/* loaded from: classes13.dex */
public class m {

    /* renamed from: b, reason: collision with root package name */
    public final java.io.File f437937b;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.sortlist.DragSortListView f437941f;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuilder f437936a = new java.lang.StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public int f437938c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f437939d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f437940e = false;

    public m(com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView) {
        this.f437941f = dragSortListView;
        java.io.File file = new java.io.File(android.os.Environment.getExternalStorageDirectory(), "dslv_state.txt");
        this.f437937b = file;
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile()) {
                com.tencent.mm.ui.yk.b("mobeta", "creat file fail!! file already exist", new java.lang.Object[0]);
            }
            com.tencent.mm.ui.yk.a("mobeta", "file created", new java.lang.Object[0]);
        } catch (java.io.IOException e17) {
            com.tencent.mm.ui.yk.f("mobeta", "Could not create dslv_state.txt", new java.lang.Object[0]);
            com.tencent.mm.ui.yk.a("mobeta", e17.getMessage(), new java.lang.Object[0]);
        }
    }

    public void a() {
        java.lang.StringBuilder sb6 = this.f437936a;
        if (!this.f437940e) {
            return;
        }
        java.io.BufferedWriter bufferedWriter = null;
        try {
            java.io.BufferedWriter bufferedWriter2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.f437937b, this.f437939d != 0), com.tencent.mapsdk.internal.rv.f51270c));
            try {
                bufferedWriter2.write(sb6.toString());
                sb6.delete(0, sb6.length());
                bufferedWriter2.flush();
                this.f437939d++;
                try {
                    bufferedWriter2.close();
                } catch (java.io.IOException e17) {
                    com.tencent.mm.ui.yk.d("DragSortListView", e17, "IOException", new java.lang.Object[0]);
                }
            } catch (java.io.IOException unused) {
                bufferedWriter = bufferedWriter2;
                if (bufferedWriter != null) {
                    try {
                        bufferedWriter.close();
                    } catch (java.io.IOException e18) {
                        com.tencent.mm.ui.yk.d("DragSortListView", e18, "IOException", new java.lang.Object[0]);
                    }
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                bufferedWriter = bufferedWriter2;
                if (bufferedWriter != null) {
                    try {
                        bufferedWriter.close();
                    } catch (java.io.IOException e19) {
                        com.tencent.mm.ui.yk.d("DragSortListView", e19, "IOException", new java.lang.Object[0]);
                    }
                }
                throw th;
            }
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
