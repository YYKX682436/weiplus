package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class DownloadProgressImageView extends androidx.appcompat.widget.AppCompatImageView {

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f182105f;

    /* renamed from: g, reason: collision with root package name */
    public vz.j1 f182106g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f182107h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.DownloadTaskInfo f182108i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f182109m;

    /* renamed from: n, reason: collision with root package name */
    public int f182110n;

    /* loaded from: classes8.dex */
    public static class DownloadTaskInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.DownloadTaskInfo> CREATOR = new com.tencent.mm.plugin.webview.luggage.g();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f182111d;

        /* renamed from: e, reason: collision with root package name */
        public int f182112e;

        /* renamed from: f, reason: collision with root package name */
        public int f182113f;

        public DownloadTaskInfo(android.os.Parcel parcel, com.tencent.mm.plugin.webview.luggage.d dVar) {
            this.f182111d = parcel.readString();
            this.f182112e = parcel.readInt();
            this.f182113f = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(java.lang.Object obj) {
            return obj != null && (obj instanceof com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.DownloadTaskInfo) && ((com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.DownloadTaskInfo) obj).f182111d.equals(this.f182111d);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f182111d);
            parcel.writeInt(this.f182112e);
            parcel.writeInt(this.f182113f);
        }
    }

    /* loaded from: classes8.dex */
    public static class GetDownloadWidgeInfoTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.GetDownloadWidgeInfoTask> CREATOR = new com.tencent.mm.plugin.webview.luggage.h();

        /* renamed from: f, reason: collision with root package name */
        public java.util.ArrayList f182114f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.Runnable f182115g;

        public /* synthetic */ GetDownloadWidgeInfoTask(android.os.Parcel parcel, com.tencent.mm.plugin.webview.luggage.d dVar) {
            this(parcel);
        }

        @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
        public void v(android.os.Parcel parcel) {
            this.f182114f = parcel.readArrayList(com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.DownloadTaskInfo.class.getClassLoader());
        }

        @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeList(this.f182114f);
        }

        @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
        public void y() {
            java.lang.Runnable runnable = this.f182115g;
            if (runnable != null) {
                ((com.tencent.mm.plugin.webview.luggage.e) runnable).run();
            }
        }

        @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
        public void z() {
            if (i95.n0.c(m02.s.class) == null) {
                return;
            }
            java.util.LinkedList Ai = ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ai();
            if (com.tencent.mm.sdk.platformtools.t8.L0(Ai)) {
                c();
                return;
            }
            java.util.Iterator it = Ai.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.downloader_app.api.DownloadWidgetTaskInfo downloadWidgetTaskInfo = (com.tencent.mm.plugin.downloader_app.api.DownloadWidgetTaskInfo) it.next();
                com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.DownloadTaskInfo downloadTaskInfo = new com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.DownloadTaskInfo();
                downloadTaskInfo.f182111d = downloadWidgetTaskInfo.f97227d;
                downloadTaskInfo.f182112e = downloadWidgetTaskInfo.f97233m;
                downloadTaskInfo.f182113f = downloadWidgetTaskInfo.f97230g;
                this.f182114f.add(downloadTaskInfo);
            }
            c();
        }

        public GetDownloadWidgeInfoTask() {
            this.f182114f = new java.util.ArrayList();
        }

        private GetDownloadWidgeInfoTask(android.os.Parcel parcel) {
            this.f182114f = new java.util.ArrayList();
            v(parcel);
        }
    }

    public DownloadProgressImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f182107h = new java.util.concurrent.CopyOnWriteArrayList();
        this.f182109m = false;
        this.f182110n = 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadProgressImageView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        this.f182109m = com.tencent.mm.ui.bk.C();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f182105f = paint;
        paint.setAntiAlias(true);
        this.f182105f.setStyle(android.graphics.Paint.Style.STROKE);
        this.f182106g = new com.tencent.mm.plugin.webview.luggage.d(this);
        com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.GetDownloadWidgeInfoTask getDownloadWidgeInfoTask = new com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.GetDownloadWidgeInfoTask();
        getDownloadWidgeInfoTask.f182115g = new com.tencent.mm.plugin.webview.luggage.e(this, getDownloadWidgeInfoTask);
        getDownloadWidgeInfoTask.d();
        setOnClickListener(new com.tencent.mm.plugin.webview.luggage.f(this));
    }

    public static void n(com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView downloadProgressImageView) {
        downloadProgressImageView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadProgressImageView", "updateDownloadState");
        downloadProgressImageView.f182108i = null;
        if (com.tencent.mm.sdk.platformtools.t8.L0(downloadProgressImageView.f182107h)) {
            downloadProgressImageView.setImageDrawableWrapper(1);
            return;
        }
        java.util.Iterator it = downloadProgressImageView.f182107h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.DownloadTaskInfo downloadTaskInfo = (com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.DownloadTaskInfo) it.next();
            if (downloadTaskInfo.f182112e == 1) {
                downloadProgressImageView.f182108i = downloadTaskInfo;
                break;
            }
        }
        if (downloadProgressImageView.f182108i != null) {
            downloadProgressImageView.setImageDrawableWrapper(1);
        } else if (((com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.DownloadTaskInfo) downloadProgressImageView.f182107h.get(0)).f182112e == 3) {
            downloadProgressImageView.setImageDrawableWrapper(3);
        } else {
            downloadProgressImageView.setImageDrawableWrapper(2);
        }
    }

    private void setImageDrawableWrapper(int i17) {
        this.f182110n = i17;
        r();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vz.l1 l1Var = (vz.l1) i95.n0.c(vz.l1.class);
        vz.j1 j1Var = this.f182106g;
        ((uz.e) l1Var).getClass();
        if (j1Var != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) com.tencent.mm.plugin.downloader.event.c.f96910g).add(j1Var);
        } else {
            com.tencent.mm.plugin.downloader.event.c cVar = com.tencent.mm.plugin.downloader.event.c.f96907d;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vz.l1 l1Var = (vz.l1) i95.n0.c(vz.l1.class);
        vz.j1 j1Var = this.f182106g;
        ((uz.e) l1Var).getClass();
        if (j1Var != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) com.tencent.mm.plugin.downloader.event.c.f96910g).remove(j1Var);
        } else {
            com.tencent.mm.plugin.downloader.event.c cVar = com.tencent.mm.plugin.downloader.event.c.f96907d;
        }
    }

    public final void r() {
        int i17 = this.f182110n;
        int i18 = i17 != 1 ? i17 != 2 ? i17 != 3 ? 0 : this.f182109m ? com.tencent.mm.R.raw.download_install_dark : com.tencent.mm.R.raw.download_install : this.f182109m ? com.tencent.mm.R.raw.download_pause_dark : com.tencent.mm.R.raw.download_pause : this.f182109m ? com.tencent.mm.R.raw.download_default_dark : com.tencent.mm.R.raw.download_default;
        if (i18 != 0) {
            setImageResource(i18);
        }
    }

    public void setDarkMode(boolean z17) {
        this.f182109m = z17;
        r();
    }
}
