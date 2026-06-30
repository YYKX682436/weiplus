package com.tencent.thumbplayer.core.player;

/* loaded from: classes16.dex */
public class TPNativePlayer {
    private android.content.Context mContext;
    private long mNativeContext;
    private int m_playerID;

    public TPNativePlayer(android.content.Context context) {
        this.m_playerID = -1;
        this.mContext = null;
        this.mContext = context.getApplicationContext();
        com.tencent.thumbplayer.core.common.TPNativeLibraryLoader.loadLibIfNeeded(context);
        try {
            this.m_playerID = _createPlayer();
            com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.init(this.mContext);
            com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.init(this.mContext);
            com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.init(this.mContext);
            com.tencent.thumbplayer.core.common.TPSystemInfo.initAudioBestSettings(this.mContext);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, "Failed to create native player:" + th6.getMessage());
            throw new java.lang.UnsupportedOperationException("Failed to create native player");
        }
    }

    private native int _addAudioTrackSource(java.lang.String str, java.lang.String str2);

    private native int _addAudioTrackSourceWithHttpHeader(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr);

    private native int _addInitConfigQueueInt(int i17, int i18);

    private native int _addInitConfigQueueString(int i17, java.lang.String str);

    private native int _addSubtitleTrackSource(java.lang.String str, java.lang.String str2);

    private native int _addSubtitleTrackSourceWithHttpHeader(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr);

    private native int _applyInitConfig();

    private native int _configBufferDurationAsync(int i17, long j17, long j18, long j19);

    private native int _createPlayer();

    private native int _deselectTrackAsync(int i17, long j17);

    private native int _getAutoExpendBufferCount();

    private native long _getBufferIOMaxReadDurationPosMs();

    private native long _getBufferIOMaxReadFileOffset();

    private native long _getBufferIOMaxWriteDurationPosMs();

    private native long _getBufferIOMaxWriteFileOffset();

    private native long _getBufferedDurationMs();

    private native long _getBufferedSize();

    private native int _getContainerType(int i17);

    private native long _getCurrentPositionMs();

    private native long _getDemuxerOffsetInFile();

    private native long _getDurationMs();

    private native com.tencent.thumbplayer.core.player.TPDynamicStatisticParams _getDynamicStatisticParams(boolean z17);

    private native com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams _getGeneralPlayFlowParams();

    private static native java.lang.Object _getPlayerCoreParams(int i17);

    private native int _getPlayerID();

    private native int _getProgramCount();

    private native com.tencent.thumbplayer.core.player.TPNativePlayerProgramInfo _getProgramInfo(int i17);

    private native long _getPropertyLong(int i17);

    private native java.lang.String _getPropertyString(int i17);

    private native int _getTrackCount();

    private native com.tencent.thumbplayer.core.common.TPMediaTrackDashFormat _getTrackDashFormat(int i17);

    private native com.tencent.thumbplayer.core.player.TPNativePlayerHlsTag _getTrackHlsTag(int i17);

    private native boolean _getTrackIsExclusive(int i17);

    private native boolean _getTrackIsInternal(int i17);

    private native boolean _getTrackIsSelected(int i17);

    private native java.lang.String _getTrackName(int i17);

    private native int _getTrackType(int i17);

    private native int _getVideoHeight();

    private native int _getVideoWidth();

    private native int _pause();

    private native int _prepare();

    private native int _prepareAsync();

    private native int _release();

    private native int _reset();

    private native int _resetInitConfig();

    private native int _resume();

    private native int _seekToAsync(int i17, int i18, long j17);

    private native int _selectProgramAsync(int i17, long j17);

    private native int _selectTrackAsync(int i17, long j17);

    private native int _setAudioFrameCallback(java.lang.Object obj);

    private native int _setAudioMute(boolean z17);

    private native int _setAudioNormalizeVolumeParams(java.lang.String str);

    private native int _setAudioVolume(float f17);

    private native int _setDataSource(java.lang.String str);

    private native int _setDataSourceFd(int i17, long j17, long j18);

    private native int _setDataSourceWithHttpHeader(java.lang.String str, java.lang.Object[] objArr);

    private native int _setDemuxerCallback(java.lang.Object obj);

    private native int _setEventRecordCallback(java.lang.Object obj);

    private native int _setInitConfigBool(int i17, boolean z17);

    private native int _setInitConfigFloat(int i17, float f17);

    private native int _setInitConfigInt(int i17, int i18);

    private native int _setInitConfigLong(int i17, long j17);

    private native int _setInitConfigObject(int i17, java.lang.Object obj);

    private native int _setInitConfigString(int i17, java.lang.String str);

    private native int _setLoopback(boolean z17, long j17, long j18);

    private native int _setMessageCallback(java.lang.Object obj);

    private native int _setOptionLong(int i17, long j17, long j18);

    private native int _setOptionObject(int i17, java.lang.Object obj);

    private native int _setPlaySharpenSwitch();

    private native int _setPlaybackRate(float f17);

    private native int _setPostProcessFrameCallback(java.lang.Object obj);

    private native int _setSubtitleFrameCallback(java.lang.Object obj);

    private native int _setVideoFrameCallback(java.lang.Object obj);

    private native int _setVideoSurface(android.view.Surface surface);

    private native int _setVideoSurfaceWithType(android.view.Surface surface, int i17);

    private native int _start();

    private native int _stop();

    private native int _switchDefinitionAsync(java.lang.String str, int i17, long j17);

    private native int _switchDefinitionAsyncWithHttpHeader(java.lang.String str, java.lang.Object[] objArr, int i17, long j17);

    private native int _switchHdrModeWithSurface(android.view.Surface surface, int i17, int i18);

    public int addAudioTrackSource(java.lang.String str, java.lang.String str2) {
        try {
            return _addAudioTrackSource(str, str2);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int addSubtitleTrackSource(java.lang.String str, java.lang.String str2) {
        try {
            return _addSubtitleTrackSource(str, str2);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int configBufferDurationAsync(int i17, long j17, long j18, long j19) {
        try {
            return _configBufferDurationAsync(i17, j17, j18, j19);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int deselectTrackAsync(int i17, long j17) {
        try {
            return _deselectTrackAsync(i17, j17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int getAutoExpendBufferCount() {
        try {
            return _getAutoExpendBufferCount();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return 0;
        }
    }

    public long getBufferIOMaxReadDurationPosMs() {
        try {
            return _getBufferIOMaxReadDurationPosMs();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return 0L;
        }
    }

    public long getBufferIOMaxReadFileOffset() {
        try {
            return _getBufferIOMaxReadFileOffset();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return 0L;
        }
    }

    public long getBufferIOMaxWriteDurationPosMs() {
        try {
            return _getBufferIOMaxWriteDurationPosMs();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return 0L;
        }
    }

    public long getBufferIOMaxWriteFileOffset() {
        try {
            return _getBufferIOMaxWriteFileOffset();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return 0L;
        }
    }

    public long getBufferedDurationMs() {
        try {
            return _getBufferedDurationMs();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return 0L;
        }
    }

    public long getBufferedSize() {
        try {
            return _getBufferedSize();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return 0L;
        }
    }

    public long getCurrentPositionMs() {
        try {
            return _getCurrentPositionMs();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return 0L;
        }
    }

    public long getDemuxerOffsetInFile() {
        try {
            return _getDemuxerOffsetInFile();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return -1L;
        }
    }

    public long getDurationMs() {
        try {
            return _getDurationMs();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return 0L;
        }
    }

    public com.tencent.thumbplayer.core.player.TPDynamicStatisticParams getDynamicStatisticParams(boolean z17) {
        try {
            return _getDynamicStatisticParams(z17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return null;
        }
    }

    public com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
        try {
            return _getGeneralPlayFlowParams();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return null;
        }
    }

    public java.lang.Object getPlayerCoreParams(int i17) {
        return null;
    }

    public int getPlayerID() {
        try {
            return _getPlayerID();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return 0;
        }
    }

    public int getProgramCount() {
        try {
            return _getProgramCount();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public com.tencent.thumbplayer.core.player.TPNativePlayerProgramInfo[] getProgramInfo() {
        try {
            int _getProgramCount = _getProgramCount();
            com.tencent.thumbplayer.core.player.TPNativePlayerProgramInfo[] tPNativePlayerProgramInfoArr = new com.tencent.thumbplayer.core.player.TPNativePlayerProgramInfo[_getProgramCount];
            for (int i17 = 0; i17 < _getProgramCount; i17++) {
                tPNativePlayerProgramInfoArr[i17] = _getProgramInfo(i17);
            }
            return tPNativePlayerProgramInfoArr;
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return null;
        }
    }

    public long getPropertyLong(int i17) {
        try {
            return _getPropertyLong(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return 0L;
        }
    }

    public java.lang.String getPropertyString(int i17) {
        try {
            return _getPropertyString(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return "";
        }
    }

    public com.tencent.thumbplayer.core.common.TPMediaTrackInfo[] getTrackInfo() {
        try {
            int _getTrackCount = _getTrackCount();
            if (_getTrackCount <= 0) {
                return null;
            }
            com.tencent.thumbplayer.core.common.TPMediaTrackInfo[] tPMediaTrackInfoArr = new com.tencent.thumbplayer.core.common.TPMediaTrackInfo[_getTrackCount];
            for (int i17 = 0; i17 < _getTrackCount; i17++) {
                com.tencent.thumbplayer.core.common.TPMediaTrackInfo tPMediaTrackInfo = new com.tencent.thumbplayer.core.common.TPMediaTrackInfo();
                tPMediaTrackInfoArr[i17] = tPMediaTrackInfo;
                tPMediaTrackInfo.trackType = _getTrackType(i17);
                tPMediaTrackInfoArr[i17].contianerType = _getContainerType(i17);
                tPMediaTrackInfoArr[i17].trackName = _getTrackName(i17);
                tPMediaTrackInfoArr[i17].isSelected = _getTrackIsSelected(i17);
                tPMediaTrackInfoArr[i17].isExclusive = _getTrackIsExclusive(i17);
                tPMediaTrackInfoArr[i17].isInternal = _getTrackIsInternal(i17);
                com.tencent.thumbplayer.core.common.TPMediaTrackInfo tPMediaTrackInfo2 = tPMediaTrackInfoArr[i17];
                int i18 = tPMediaTrackInfo2.contianerType;
                if (i18 == 1) {
                    com.tencent.thumbplayer.core.player.TPNativePlayerHlsTag _getTrackHlsTag = _getTrackHlsTag(i17);
                    com.tencent.thumbplayer.core.common.TPMediaTrackHlsTag tPMediaTrackHlsTag = tPMediaTrackInfoArr[i17].hlsTag;
                    tPMediaTrackHlsTag.name = _getTrackHlsTag.name;
                    tPMediaTrackHlsTag.language = _getTrackHlsTag.language;
                    tPMediaTrackHlsTag.groupId = _getTrackHlsTag.groupId;
                    tPMediaTrackHlsTag.resolution = _getTrackHlsTag.resolution;
                    tPMediaTrackHlsTag.codecs = _getTrackHlsTag.codecs;
                    tPMediaTrackHlsTag.framerate = _getTrackHlsTag.framerate;
                    tPMediaTrackHlsTag.bandwidth = _getTrackHlsTag.bandwidth;
                } else if (i18 == 2) {
                    tPMediaTrackInfo2.dashFormat = _getTrackDashFormat(i17);
                }
            }
            return tPMediaTrackInfoArr;
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return null;
        }
    }

    public int getVideoHeight() {
        try {
            return _getVideoHeight();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return 0;
        }
    }

    public int getVideoWidth() {
        try {
            return _getVideoWidth();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return 0;
        }
    }

    public int pause() {
        try {
            return _pause();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int prepare() {
        try {
            return _prepare();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int prepareAsync() {
        try {
            return _prepareAsync();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public void release() {
        try {
            _release();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
        }
    }

    public void reset() {
        try {
            _reset();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
        }
    }

    public int seekToAsync(int i17, int i18, long j17) {
        try {
            return _seekToAsync(i17, i18, j17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int selectProgramAsync(int i17, long j17) {
        try {
            return _selectProgramAsync(i17, j17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int selectTrackAsync(int i17, long j17) {
        try {
            return _selectTrackAsync(i17, j17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int setAudioFrameCallback(com.tencent.thumbplayer.core.player.ITPNativePlayerAudioFrameCallback iTPNativePlayerAudioFrameCallback) {
        try {
            return _setAudioFrameCallback(iTPNativePlayerAudioFrameCallback);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int setAudioMute(boolean z17) {
        try {
            return _setAudioMute(z17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int setAudioNormalizeVolumeParams(java.lang.String str) {
        try {
            return _setAudioNormalizeVolumeParams(str);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int setAudioVolume(float f17) {
        try {
            return _setAudioVolume(f17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int setDataSource(java.lang.String str) {
        try {
            return _setDataSource(str);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int setDemuxerCallback(com.tencent.thumbplayer.core.demuxer.ITPNativeDemuxerCallback iTPNativeDemuxerCallback) {
        try {
            return _setDemuxerCallback(iTPNativeDemuxerCallback);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int setEventRecordCallback(com.tencent.thumbplayer.core.player.ITPNativePlayerEventRecordCallback iTPNativePlayerEventRecordCallback) {
        try {
            return _setEventRecordCallback(iTPNativePlayerEventRecordCallback);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public void setInitConfig(com.tencent.thumbplayer.core.player.TPNativePlayerInitConfig tPNativePlayerInitConfig) {
        try {
            _resetInitConfig();
            java.util.HashMap<java.lang.Integer, java.lang.Integer> intMap = tPNativePlayerInitConfig.getIntMap();
            java.util.HashMap<java.lang.Integer, java.lang.String> stringMap = tPNativePlayerInitConfig.getStringMap();
            java.util.HashMap<java.lang.Integer, java.lang.Long> longMap = tPNativePlayerInitConfig.getLongMap();
            java.util.HashMap<java.lang.Integer, java.lang.Float> floatMap = tPNativePlayerInitConfig.getFloatMap();
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> boolMap = tPNativePlayerInitConfig.getBoolMap();
            java.util.HashMap<java.lang.Integer, java.util.Vector<java.lang.Integer>> queueIntMap = tPNativePlayerInitConfig.getQueueIntMap();
            java.util.HashMap<java.lang.Integer, java.lang.Object> objectMap = tPNativePlayerInitConfig.getObjectMap();
            for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry : intMap.entrySet()) {
                _setInitConfigInt(entry.getKey().intValue(), entry.getValue().intValue());
            }
            for (java.util.Map.Entry<java.lang.Integer, java.lang.String> entry2 : stringMap.entrySet()) {
                _setInitConfigString(entry2.getKey().intValue(), entry2.getValue());
            }
            for (java.util.Map.Entry<java.lang.Integer, java.lang.Long> entry3 : longMap.entrySet()) {
                _setInitConfigLong(entry3.getKey().intValue(), entry3.getValue().longValue());
            }
            for (java.util.Map.Entry<java.lang.Integer, java.lang.Float> entry4 : floatMap.entrySet()) {
                _setInitConfigFloat(entry4.getKey().intValue(), entry4.getValue().floatValue());
            }
            for (java.util.Map.Entry<java.lang.Integer, java.lang.Boolean> entry5 : boolMap.entrySet()) {
                _setInitConfigBool(entry5.getKey().intValue(), entry5.getValue().booleanValue());
            }
            for (java.util.Map.Entry<java.lang.Integer, java.lang.Object> entry6 : objectMap.entrySet()) {
                _setInitConfigObject(entry6.getKey().intValue(), entry6.getValue());
            }
            for (java.util.Map.Entry<java.lang.Integer, java.util.Vector<java.lang.Integer>> entry7 : queueIntMap.entrySet()) {
                java.util.Vector<java.lang.Integer> value = entry7.getValue();
                if (value != null) {
                    java.util.Iterator<java.lang.Integer> it = value.iterator();
                    while (it.hasNext()) {
                        _addInitConfigQueueInt(entry7.getKey().intValue(), it.next().intValue());
                    }
                }
            }
            for (java.util.Map.Entry<java.lang.Integer, java.util.Vector<java.lang.String>> entry8 : tPNativePlayerInitConfig.getQueueStringMap().entrySet()) {
                java.util.Vector<java.lang.String> value2 = entry8.getValue();
                if (value2 != null) {
                    java.util.Iterator<java.lang.String> it6 = value2.iterator();
                    while (it6.hasNext()) {
                        _addInitConfigQueueString(entry8.getKey().intValue(), it6.next());
                    }
                }
            }
            _applyInitConfig();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
        }
    }

    public int setLoopback(boolean z17, long j17, long j18) {
        try {
            return _setLoopback(z17, j17, j18);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int setMessageCallback(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback iTPNativePlayerMessageCallback) {
        try {
            return _setMessageCallback(iTPNativePlayerMessageCallback);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int setOptionLong(int i17, long j17, long j18) {
        try {
            return _setOptionLong(i17, j17, j18);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int setOptionObject(int i17, java.lang.Object obj) {
        try {
            return _setOptionObject(i17, obj);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int setPlaySharpenSwitch() {
        try {
            return _setPlaySharpenSwitch();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int setPlaybackRate(float f17) {
        try {
            return _setPlaybackRate(f17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int setPostProcessFrameCallback(com.tencent.thumbplayer.core.player.ITPNativePlayerPostProcessFrameCallback iTPNativePlayerPostProcessFrameCallback) {
        try {
            return _setPostProcessFrameCallback(iTPNativePlayerPostProcessFrameCallback);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int setSubtitleFrameCallback(com.tencent.thumbplayer.core.player.ITPNativePlayerSubtitleFrameCallback iTPNativePlayerSubtitleFrameCallback) {
        try {
            return _setSubtitleFrameCallback(iTPNativePlayerSubtitleFrameCallback);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int setVideoFrameCallback(com.tencent.thumbplayer.core.player.ITPNativePlayerVideoFrameCallback iTPNativePlayerVideoFrameCallback) {
        try {
            return _setVideoFrameCallback(iTPNativePlayerVideoFrameCallback);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int setVideoSurface(android.view.Surface surface) {
        try {
            return _setVideoSurface(surface);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int setVideoSurfaceWithType(android.view.Surface surface, int i17) {
        try {
            return _setVideoSurfaceWithType(surface, i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int start() {
        try {
            return _start();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int stop() {
        try {
            return _stop();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    @java.lang.Deprecated
    public int switchDefinitionAsync(java.lang.String str, long j17) {
        return switchDefinitionAsync(str, 0, j17);
    }

    public int switchHdrModeWithSurface(android.view.Surface surface, int i17, int i18) {
        try {
            return _switchHdrModeWithSurface(surface, i17, i18);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int switchDefinitionAsync(java.lang.String str, int i17, long j17) {
        try {
            return _switchDefinitionAsync(str, i17, j17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int addAudioTrackSource(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        try {
            return _addAudioTrackSourceWithHttpHeader(str, str2, com.tencent.thumbplayer.core.player.TPNativePlayerUtils.tpMapStringToStringArray(map));
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int addSubtitleTrackSource(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        try {
            return _addSubtitleTrackSourceWithHttpHeader(str, str2, com.tencent.thumbplayer.core.player.TPNativePlayerUtils.tpMapStringToStringArray(map));
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int setDataSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        try {
            return _setDataSourceWithHttpHeader(str, com.tencent.thumbplayer.core.player.TPNativePlayerUtils.tpMapStringToStringArray(map));
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int switchDefinitionAsync(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, int i17, long j17) {
        try {
            return _switchDefinitionAsyncWithHttpHeader(str, com.tencent.thumbplayer.core.player.TPNativePlayerUtils.tpMapStringToStringArray(map), i17, j17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }

    public int setDataSource(int i17, long j17, long j18) {
        try {
            return _setDataSourceFd(i17, j17, j18);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
    }
}
